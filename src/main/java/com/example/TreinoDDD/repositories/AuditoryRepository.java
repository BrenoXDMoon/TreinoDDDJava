package com.example.TreinoDDD.repositories;

import com.example.TreinoDDD.entity.Audithory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoryRepository extends JpaRepository<Audithory, Long> {

    void deleteAudithoryByOperationUser_Id(Long id);
}
