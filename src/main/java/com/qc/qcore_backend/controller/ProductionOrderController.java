package com.qc.qcore_backend.controller;

import com.qc.qcore_backend.model.ProductionOrder;
import com.qc.qcore_backend.repository.ProductionOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<ProductionOrder> getOrderById(@PathVariable Integer id) {
        return orderRepository.findById(id);
    }

    @PostMapping
    public ProductionOrder createOrder(@RequestBody ProductionOrder order) {
        return orderRepository.save(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Integer id) {
        orderRepository.deleteById(id);
    }
}