package com.example.technical_inspection_register.controller;

import com.example.technical_inspection_register.entity.TechnicalInspectionRegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.technical_inspection_register.repository.TechnicalInspectionRegisterRepository;

import java.time.LocalDate;

@RestController
public class TechnicalInspectionController {
    @Autowired
    private TechnicalInspectionRegisterRepository inspectionRepo;

    @GetMapping("/check_tech/{vin}")
    public Boolean get(@PathVariable String vin){
        TechnicalInspectionRegisterEntity inspection = inspectionRepo.getTechnicalInspectionByVinAndDate(vin, LocalDate.now());
        if (inspection!=null)
            return true;
        else
            return false;
    }

    @GetMapping("/tech_test")
    public String test(){
        return "Technical inspection controller is working...";
    }
}
