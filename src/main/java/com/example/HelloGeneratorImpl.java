package com.example;

import io.micronaut.tracing.annotation.NewSpan;
import io.opentracing.Tracer;
import jakarta.inject.Singleton;

@Singleton
public class HelloGeneratorImpl implements HelloGenerator{

    private Tracer tracer;

    public HelloGeneratorImpl(Tracer tracer) {
        this.tracer = tracer;
    }

    @NewSpan
    @Override
    public String hello() {
        var traceId = tracer.activeSpan().context().toTraceId();
        var spanId = tracer.activeSpan().context().toSpanId();
        System.out.println(String.format("h trace: %s, span: %s", traceId, spanId));
        return "Hello";
    }
}
