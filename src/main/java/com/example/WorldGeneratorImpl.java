package com.example;

import jakarta.inject.Singleton;

@Singleton
public class WorldGeneratorImpl implements WorldGenerator {

    @Override
    public String getName() {
        return "World";
    }
}
