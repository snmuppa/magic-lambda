package com.aws.lambda.magic.handler;
import java.io.IOException;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.lambda.magic.dependencyinjection.ServiceInjector;
import com.aws.lambda.magic.model.twilio.TwilioRequest;
import com.aws.lambda.magic.model.twilio.TwilioResponse;
import com.aws.lambda.magic.service.TwilioResponseService;
import com.google.inject.Inject;

public class MagicCardHandler implements RequestHandler<TwilioRequest, TwilioResponse> {
	@Inject
	private TwilioResponseService twilioResponseService;
	
	public MagicCardHandler() { 
		ServiceInjector.getInjector().injectMembers(this);
	}
	
    public TwilioResponse handleRequest(TwilioRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log(request.toString());

        String body = (request.getBody() != null) ? request.getBody().trim().toLowerCase() : "";

        if (!TwilioResponseService.MAGIC_COMMAND.equals(body)) {
            return twilioResponseService.getErrorResponse();
        }
        
        TwilioResponse reponse = null;
		try {
			reponse = twilioResponseService.getMagicResponse();
			logger.log(reponse.toString());
		} catch (IOException e) {
			logger.log(e.toString());
			logger.log("Response is null.");
		}
        		
        return reponse;
    }
}
