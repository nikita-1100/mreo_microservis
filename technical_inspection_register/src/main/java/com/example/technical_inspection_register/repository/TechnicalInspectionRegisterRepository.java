package com.example.technical_inspection_register.repository;

import com.example.technical_inspection_register.entity.TechnicalInspectionRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface TechnicalInspectionRegisterRepository extends JpaRepository<TechnicalInspectionRegisterEntity, Long> {
    @Query("SELECT t FROM TechnicalInspectionRegisterEntity t WHERE t.vin = (:vin) and t.dateEnd>=(:todayDate)")
    TechnicalInspectionRegisterEntity getTechnicalInspectionByVinAndDate(String vin, LocalDate todayDate);
}
