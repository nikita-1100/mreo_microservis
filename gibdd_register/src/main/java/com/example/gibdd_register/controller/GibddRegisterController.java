package com.example.gibdd_register.controller;

import com.example.gibdd_register.entity.GibddRegisterEntity;
import com.example.gibdd_register.repository.GibddRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GibddRegisterController {
    @Autowired
    private GibddRegisterRepository repository;

    @PostMapping("/gibdd")
    public HttpStatus post(@RequestBody GibddRegisterEntity dpsRegister){

        return HttpStatus.CREATED;
    }

    @GetMapping("/gibdd_getall")
    public List<GibddRegisterEntity> getAll(){
        return repository.findAll();
    }

    @GetMapping("/gibdd_for_test")
    public String getHelloWorld() {
        return "GIBDD test. If you see it, everything good!";
    }

}