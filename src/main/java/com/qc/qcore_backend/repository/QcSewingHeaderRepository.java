package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcSewingHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QcSewingHeaderRepository extends JpaRepository<QcSewingHeader, Integer> {
}