package com.aws.lambda.magic.dependencyinjection;

import com.aws.lambda.magic.service.MagicCardService;
import com.aws.lambda.magic.service.S3Service;
import com.aws.lambda.magic.service.TwilioResponseService;
import com.aws.lamdba.magic.service.impl.MagicCardServiceImpl;
import com.aws.lamdba.magic.service.impl.S3ServiceImpl;
import com.aws.lamdba.magic.service.impl.TwilioResponseServiceImpl;
import com.google.inject.AbstractModule;

public class LambdaModule extends AbstractModule {
    @Override
    protected void configure() {
        // Get MagicCardServiceImpl
        bind(MagicCardService.class).to(MagicCardServiceImpl.class);

        // Get TwilioResponseServiceImpl 
        bind(TwilioResponseService.class).to(TwilioResponseServiceImpl.class);
        
        //Get S3ServiceImpl
        bind(S3Service.class).to(S3ServiceImpl.class);
    }
}
