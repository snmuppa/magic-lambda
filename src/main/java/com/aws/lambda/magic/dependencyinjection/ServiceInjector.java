package com.aws.lambda.magic.dependencyinjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ServiceInjector {
    private static final Injector injector = Guice.createInjector(new LambdaModule());

    public static Injector getInjector() {
        return injector;
    }
}
