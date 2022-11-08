package com.example;

import io.micronaut.tracing.annotation.NewSpan;

public interface WorldGenerator {

    @NewSpan
    String getName();
}
