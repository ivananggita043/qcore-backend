package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcPackingHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QcPackingHeaderRepository extends JpaRepository<QcPackingHeader, Integer> {
}