package com.aws.lamdba.magic.service.impl;

import java.io.IOException;

import com.aws.lambda.magic.model.twilio.TwilioResponse;
import com.aws.lambda.magic.service.S3Service;
import com.aws.lambda.magic.service.TwilioResponseService;
import com.google.inject.Inject;

public class TwilioResponseServiceImpl implements TwilioResponseService {
	@Inject
	S3Service s3Service;
	
	@Override
	public TwilioResponse getMagicResponse() throws IOException {
	    TwilioResponse response = new TwilioResponse();
	    String imageProxyUrl = s3Service.getRandomMagicCardImageUrl();
	    response.getMessage().setMedia(imageProxyUrl);
	    return response;
	}
	
	@Override
	public TwilioResponse getErrorResponse() {
	    TwilioResponse response = new TwilioResponse();
	    response
	        .getMessage()
	        .setBody("Send\n\n" + MAGIC_COMMAND + "\n\nto get a random Magic the Gathering card sent to you.");
	    return response;
	}
}
