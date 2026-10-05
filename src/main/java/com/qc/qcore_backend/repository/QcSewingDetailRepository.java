package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcSewingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QcSewingDetailRepository extends JpaRepository<QcSewingDetail, Integer> {
    List<QcSewingDetail> findBySewingHeaderSewingHeaderId(Integer sewingHeaderId);
}