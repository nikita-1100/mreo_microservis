package com.example.gibdd_register.controller;

import com.example.gibdd_register.dto.GibddRegisterDto;
import com.example.gibdd_register.service.GibddRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GibddRegisterController {

    //Должно происходить создание записи и удаление предыдущей через проверки микросервисов
    @Autowired
    GibddRegisterService gibddRegisterService;

    @PostMapping("/vehicle_registration")
    public HttpStatus tryToRegVehicle(@RequestBody GibddRegisterDto gibddRegisterDto){
        Boolean result = gibddRegisterService.tryToRegVehicle(gibddRegisterDto);
        if (result==true)
            return HttpStatus.CREATED;
        else
            return HttpStatus.BAD_REQUEST;
    }



















//    @PostMapping("/register_vehicle")
//    public HttpStatus post(@RequestBody GibddRegisterEntity dpsRegister){
//
//        return HttpStatus.CREATED;
//    }
//
//    @GetMapping("/gibdd_getall")
//    public List<GibddRegisterEntity> getAll(){
//        return gibddRegRepo.findAll();
//    }
//
//    @GetMapping("/gibdd_for_test")
//    public String getHelloWorld() {
//        return "GIBDD test. If you see it, everything good!";
//    }

}