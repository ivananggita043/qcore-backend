package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcPackingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QcPackingDetailRepository extends JpaRepository<QcPackingDetail, Integer> {
    List<QcPackingDetail> findByPackingHeaderPackingHeaderId(Integer packingHeaderId);
}