package com.example.gibdd_register.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="insurance-register", url="localhost:8082")
public interface InsuranceRegisterProxy {
    @GetMapping("/check_insurance/{vin}")
    public Boolean checkInsuranceByVin(@PathVariable("vin") String vin);
}
