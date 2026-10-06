package com.qc.qcore_backend.service;

import com.qc.qcore_backend.model.ProductionOrder;
import com.qc.qcore_backend.repository.ProductionOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductionOrderService {

    @Autowired
    private ProductionOrderRepository orderRepository;

    public List<ProductionOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<ProductionOrder> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }

    @Transactional
    public ProductionOrder saveOrder(ProductionOrder order) {
        return orderRepository.save(order);
    }

    @Transactional
    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }
}