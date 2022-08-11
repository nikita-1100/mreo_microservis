package com.example.gibdd_register.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="technical-inspection-register", url="localhost:8082")
public interface TechnicalInspectionProxy {
    @GetMapping("/check_tech/{vin}")
    public Boolean checkTechInspectionByVin(@PathVariable("vin") String vin);
}
