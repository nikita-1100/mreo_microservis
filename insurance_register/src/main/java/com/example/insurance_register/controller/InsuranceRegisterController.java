package com.example.insurance_register.controller;

import com.example.insurance_register.entity.InsuranceRegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.insurance_register.repository.InsuranceRegisterRepository;

import java.util.List;

@RestController
public class InsuranceRegisterController {
    @Autowired
    private InsuranceRegisterRepository repository;

    @PostMapping("/insurance")
    public HttpStatus post(@RequestBody InsuranceRegisterEntity insuranceRegister){
        repository.save(insuranceRegister);
        return HttpStatus.CREATED;
    }

    @GetMapping("/insurance_getall")
    public List<InsuranceRegisterEntity> getAll(){
        return repository.findAll();
    }

    @GetMapping("/for_test")
    public String getHelloWorld() {
        return "If you see it, everything good!";
    }

}
