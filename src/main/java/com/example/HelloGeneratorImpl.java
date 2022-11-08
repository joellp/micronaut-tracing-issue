package com.example;

import io.micronaut.tracing.annotation.NewSpan;
import jakarta.inject.Singleton;

@Singleton
public class HelloGeneratorImpl implements HelloGenerator{

    @NewSpan
    @Override
    public String hello() {
        return "Hello";
    }
}
