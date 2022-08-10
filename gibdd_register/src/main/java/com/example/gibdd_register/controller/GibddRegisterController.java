package com.example.gibdd_register.controller;

import com.example.gibdd_register.dto.GibddRegisterDto;
import com.example.gibdd_register.feignClient.FineRegisterProxy;
import com.example.gibdd_register.feignClient.InsuranceRegisterProxy;
import com.example.gibdd_register.service.GibddRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GibddRegisterController {

    //Должно происходить создание записи и удаление предыдущей через проверки микросервисов
    @Autowired
    GibddRegisterService gibddRegisterService;

    @Autowired
    InsuranceRegisterProxy proxyInsurance;

    @Autowired
    FineRegisterProxy proxyFine;

    @PostMapping("/vehicle_registration")
    public HttpStatus tryToRegVehicle(@RequestBody GibddRegisterDto gibddRegisterDto){
        if (proxyInsurance.checkInsuranceByVin(gibddRegisterDto.getVehicleVin())==false)
            return HttpStatus.BAD_REQUEST;
        if (proxyFine.checkFineByVin(gibddRegisterDto.getVehicleVin())==false)
            return HttpStatus.BAD_REQUEST;

        Boolean result = gibddRegisterService.tryToRegVehicle(gibddRegisterDto);
        return result?HttpStatus.CREATED:HttpStatus.BAD_REQUEST;


    }

    @GetMapping("/gibdd_test")
    public String test(){
        return "Gibdd controller is working...";
    }



}