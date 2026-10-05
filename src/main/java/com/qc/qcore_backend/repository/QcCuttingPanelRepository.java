package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcCuttingPanel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QcCuttingPanelRepository extends JpaRepository<QcCuttingPanel, Integer> {
    List<QcCuttingPanel> findByCuttingProcessCuttingProcessId(Integer cuttingProcessId);
}