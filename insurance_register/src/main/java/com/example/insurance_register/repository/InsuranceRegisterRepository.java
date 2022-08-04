package com.example.insurance_register.repository;

import com.example.insurance_register.entity.InsuranceRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRegisterRepository extends JpaRepository<InsuranceRegisterEntity, Long> {
}
