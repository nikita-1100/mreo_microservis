package com.example.gibdd_register.service;

import com.example.gibdd_register.dto.GibddRegisterDto;
import com.example.gibdd_register.entity.GibddRegisterEntity;
import com.example.gibdd_register.repository.GibddRegisterRepository;
import com.example.gibdd_register.repository.OwnerRepository;
import com.example.gibdd_register.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GibddRegisterService {

    @Autowired
    private GibddRegisterRepository gibddRegRepo;
    @Autowired
    private VehicleRepository vehicleRepo;
    @Autowired
    private OwnerRepository ownerRepo;

    @Transactional
    public Boolean tryToRegVehicle(GibddRegisterDto registerDto){
        GibddRegisterEntity registratedVehicle = new GibddRegisterEntity();
        //registratedVehicle.setVehicle(vehicleRepo.findById(registerDto.getVehicleId()).get());
        //registratedVehicle.setOwner(ownerRepo.findById(registerDto.getOwnerId()).get());
        registratedVehicle.setVehicle(vehicleRepo.findByVin(registerDto.getVehicleVin()));
        registratedVehicle.setOwner(ownerRepo.findByInn(registerDto.getOwnerInn()));
        registratedVehicle.setNumberPlate(registerDto.getNumberPlate());
        gibddRegRepo.save(registratedVehicle);
        return true;
    }


}
