package com.example.gibdd_register.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="fine-register", url="localhost:8082")
public interface FineRegisterProxy {
    @GetMapping("/check_fines/{vin}")
    public Boolean checkFineByVin(@PathVariable("vin") String vin);
}
