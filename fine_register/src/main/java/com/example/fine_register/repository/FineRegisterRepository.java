package com.example.fine_register.repository;

import com.example.fine_register.entity.FineRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface FineRegisterRepository extends JpaRepository<FineRegisterEntity, Long> {
    @Query("SELECT sum(f.sum) FROM FineRegisterEntity f WHERE f.vin = (:vin)")
    Integer getInsuranceByVinAndDate(String vin);
}
