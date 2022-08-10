package com.example.fine_register.controller;

import com.example.fine_register.repository.FineRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FineRegisterController {
    @Autowired
    private FineRegisterRepository insuranceRepo;

    @GetMapping("/check_fines/{vin}")
    public Boolean get(@PathVariable String vin){
        Integer fineSum = insuranceRepo.getInsuranceByVinAndDate(vin);
        if (fineSum==null)
            return true;
        else
            return false;
    }

    @GetMapping("/fine_test")
    public String test(){
        return "Fine controller is working...";
    }
}
