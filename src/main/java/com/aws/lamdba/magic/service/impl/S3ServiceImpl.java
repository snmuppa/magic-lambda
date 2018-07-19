package com.aws.lamdba.magic.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.aws.lambda.magic.service.MagicCardService;
import com.aws.lambda.magic.service.S3Service;
import com.google.inject.Inject;

public class S3ServiceImpl implements S3Service {
	@Inject
	MagicCardService magicCardService;
	
	final AmazonS3 s3Client;
	
	public S3ServiceImpl() {
		s3Client = AmazonS3ClientBuilder.defaultClient();
	}
	
	@Override
	public String getRandomMagicCardImageUrl() throws AmazonServiceException, IOException {
		String cardId = magicCardService.getRandomMagicCardImageId();
		byte[] randomImage = magicCardService.getRandomMagicCardBytes(cardId);
		boolean isRandomImagePng = isPNG(randomImage);
		String randomImageName = getRandomImageName(isRandomImagePng);
		String randomImageContentType = getContentType(isRandomImagePng);
		InputStream randomImageStream  = new ByteArrayInputStream(randomImage);
		ObjectMetadata metaData = new ObjectMetadata();
		metaData.setContentType(randomImageContentType);
		PutObjectRequest request = new PutObjectRequest(S3_BUCKET_NAME, randomImageName, randomImageStream, null)
										.withCannedAcl(CannedAccessControlList.PublicRead);
		
		// Create a PutObject request
		s3Client.putObject(request);
		return String.format("%s/%s", S3_BUCKET_BASE_URL, randomImageName);
	}

	private String getRandomImageName(boolean isRandomImagePng) {
		final String imageNameFormat = "%s.%s";
		String randomString = UUID.randomUUID().toString();
		if(isRandomImagePng){
			return String.format(imageNameFormat, randomString, "png");
		} else {
			return String.format(imageNameFormat, randomString, "jpeg");
		}
	}
	
	private String getContentType(boolean isRandomImagePng) {
		if(isRandomImagePng){
			return MEDIA_TYPE_IMAGE_PNG;
		} else {
			return MEDIA_TYPE_IMAGE_JPEG;
		}
	}
	
	private boolean isPNG(byte[] image) {
        // PNG header, per http://www.libpng.org/pub/png/spec/1.2/PNG-Structure.html
        byte[] expected = { (byte) 137 , 80, 78, 71, 13, 10, 26, 10 };
        if (image == null || image.length < expected.length) { return false; }
        for (int i = 0; i < expected.length; i++) {
            if (image[i] != expected[i]) { return false; }
        }
        return true;
    }
}
