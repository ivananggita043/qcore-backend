package com.qc.qcore_backend.controller;

import com.qc.qcore_backend.model.ProductionOrder;
import com.qc.qcore_backend.repository.ProductionOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class ProductionOrderController {

    @Autowired
    private ProductionOrderRepository orderRepository;

    @GetMapping
    public List<ProductionOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping
    public ProductionOrder createOrder(@RequestBody ProductionOrder order) {
        return orderRepository.save(order);
    }
}