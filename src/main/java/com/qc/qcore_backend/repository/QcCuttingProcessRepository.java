package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcCuttingProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QcCuttingProcessRepository extends JpaRepository<QcCuttingProcess, Integer> {
    List<QcCuttingProcess> findByCuttingHeaderCuttingHeaderId(Integer cuttingHeaderId);
}