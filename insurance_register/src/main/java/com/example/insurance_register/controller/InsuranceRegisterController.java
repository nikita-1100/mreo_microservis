package com.example.insurance_register.controller;

import com.example.insurance_register.entity.InsuranceRegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.insurance_register.repository.InsuranceRegisterRepository;

import java.time.LocalDate;
import java.util.List;

@RestController
public class InsuranceRegisterController {
    @Autowired
    private InsuranceRegisterRepository insuranceRepo;

    @GetMapping("/check_insurance/{vin}")
    public Boolean get(@PathVariable String vin){
        InsuranceRegisterEntity insurance = insuranceRepo.getInsuranceByVinAndDate(vin,LocalDate.now());
        if (insurance!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/insurance_test")
    public String test(){
        return "Insurance controller is working...";
    }
}
