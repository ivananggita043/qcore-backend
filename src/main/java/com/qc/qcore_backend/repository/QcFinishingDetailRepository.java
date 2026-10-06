package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.QcFinishingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QcFinishingDetailRepository extends JpaRepository<QcFinishingDetail, Integer> {
    List<QcFinishingDetail> findByFinishingHeaderFinishingHeaderId(Integer finishingHeaderId);
}