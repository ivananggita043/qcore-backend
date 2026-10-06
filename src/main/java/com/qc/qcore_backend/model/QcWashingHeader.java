package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Entity
@Table(name = "qc_washing_headers")
@Data
public class QcWashingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "washing_header_id")
    private Integer washingHeaderId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private ProductionOrder productionOrder;

    @ManyToOne
    @JoinColumn(name = "inspector_id", nullable = false)
    private User inspector;

    @Column(name = "lot_number", nullable = false, length = 50)
    private String lotNumber;

    @Column(name = "machine_number", length = 20)
    private String machineNumber;

    @Column(name = "qty_transfer", nullable = false)
    private Integer qtyTransfer = 0;

    @Column(name = "inspect_date", nullable = false)
    private Timestamp inspectDate;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;
}