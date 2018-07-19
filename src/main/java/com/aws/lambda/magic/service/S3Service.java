package com.aws.lambda.magic.service;

import java.io.IOException;

import com.amazonaws.AmazonServiceException;

public interface S3Service {
	static final String S3_BUCKET_NAME = "twilio-magic-card";
	static final String S3_BUCKET_BASE_URL = "https://s3.amazonaws.com/" + S3_BUCKET_NAME;
	static final String MEDIA_TYPE_IMAGE_PNG = "image/png";
	static final String MEDIA_TYPE_IMAGE_JPEG = "image/jpeg";
	
	/**
	 * Returns the random magic card's S3 bucket url by storing the random magic card in S3
	 * @return random magic card's S3 bucket url
	 * @throws IOException
	 */
	String getRandomMagicCardImageUrl() throws AmazonServiceException, IOException;
}
