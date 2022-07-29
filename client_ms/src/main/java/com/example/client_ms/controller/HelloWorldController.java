package com.example.client_ms.controller;

import com.example.client_ms.entity.TestEntity;
import com.example.client_ms.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @Autowired
    private TestRepository repository;

    @PostMapping("/test")
    public void post(@RequestBody TestEntity testEntity){
        repository.save(testEntity);
    }


    @GetMapping("/hello-world/{name}")
    public String getHelloWorld(@PathVariable String name) {
        return "Hello world! " + name;
    }
}
