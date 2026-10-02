package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.ProductionOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionOrderRepository extends JpaRepository<ProductionOrder, Long> {
}