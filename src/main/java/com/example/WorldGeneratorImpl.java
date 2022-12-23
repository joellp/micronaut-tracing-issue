package com.example;

import io.opentracing.Tracer;
import jakarta.inject.Singleton;

@Singleton
public class WorldGeneratorImpl implements WorldGenerator {

    private Tracer tracer;

    public WorldGeneratorImpl(Tracer tracer) {
        this.tracer = tracer;
    }

    @Override
    public String getName() {
        var traceId = tracer.activeSpan().context().toTraceId();
        var spanId = tracer.activeSpan().context().toSpanId();
        System.out.println(String.format("w trace: %s, span: %s", traceId, spanId));
        return "World";
    }
}
