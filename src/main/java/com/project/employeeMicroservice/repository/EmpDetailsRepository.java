package com.project.employeeMicroservice.repository;

import com.project.employeeMicroservice.model.EmpDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDetailsRepository extends JpaRepository<EmpDetails, Integer> {
}

