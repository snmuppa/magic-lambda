package com.aws.lambda.magic.service;

import java.io.IOException;

import com.aws.lambda.magic.model.twilio.TwilioResponse;

public interface TwilioResponseService {

    public static final String MAGIC_COMMAND = "magic";

    TwilioResponse getMagicResponse() throws IOException;
    TwilioResponse getErrorResponse();
}
