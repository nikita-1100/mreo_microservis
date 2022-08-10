package com.example.insurance_register.repository;

import com.example.insurance_register.entity.InsuranceRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface InsuranceRegisterRepository extends JpaRepository<InsuranceRegisterEntity, Long> {
    @Query("SELECT i FROM InsuranceRegisterEntity i WHERE i.vin = (:vin) and i.dateStart<=(:todayDate) and i.dateEnd>=(:todayDate)")
    InsuranceRegisterEntity getInsuranceByVinAndDate(String vin, LocalDate todayDate);
}
