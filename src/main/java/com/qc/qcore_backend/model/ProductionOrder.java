package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "production_orders")
@Data
public class ProductionOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "buyer_name", nullable = false)
    private String buyerName;

    @Column(name = "style_name", nullable = false)
    private String styleName;
}