package com.example.gibdd_register.dto;

import com.example.gibdd_register.entity.VehicleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GibddRegisterDto {
    private Long vehicleId;
    private Long ownerId;
    private String numberPlate;
}
