package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller
public class HelloController {


    HelloGenerator helloGenerator;
    WorldGenerator nameGenerator;

    @Inject
    HelloController(HelloGenerator helloGenerator, WorldGenerator nameGenerator) {
        this.helloGenerator = helloGenerator;
        this.nameGenerator = nameGenerator;

    }

    @Get
    public String hello() {
        return helloGenerator.hello() + ", " + nameGenerator.getName();
    }
}
