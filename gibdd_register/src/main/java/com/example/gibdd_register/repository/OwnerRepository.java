package com.example.gibdd_register.repository;

import com.example.gibdd_register.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity,Long> {
    OwnerEntity findByInn(Long inn);
}
