package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcFinishingHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QcFinishingHeaderRepository extends JpaRepository<QcFinishingHeader, Integer> {
}