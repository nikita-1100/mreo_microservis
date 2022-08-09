package com.example.gibdd_register.repository;

import com.example.gibdd_register.entity.GibddRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GibddRegisterRepository extends JpaRepository<GibddRegisterEntity,Long> {
}
