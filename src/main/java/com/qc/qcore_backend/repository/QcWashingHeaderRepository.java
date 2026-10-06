package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcWashingHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QcWashingHeaderRepository extends JpaRepository<QcWashingHeader, Integer> {
}