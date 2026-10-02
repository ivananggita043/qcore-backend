package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcCuttingHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QcCuttingHeaderRepository extends JpaRepository<QcCuttingHeader, Integer> {
}