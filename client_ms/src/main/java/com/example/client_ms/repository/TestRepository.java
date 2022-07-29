package com.example.client_ms.repository;

import com.example.client_ms.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
