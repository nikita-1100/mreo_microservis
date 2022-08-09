package com.example.gibdd_register.dto;

import com.example.gibdd_register.entity.VehicleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GibddRegisterDto {
    private String vehicleVin;
    private Long ownerInn;
    private String numberPlate;
}
