package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcWashingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QcWashingDetailRepository extends JpaRepository<QcWashingDetail, Integer> {
    List<QcWashingDetail> findByWashingHeaderWashingHeaderId(Integer washingHeaderId);
}