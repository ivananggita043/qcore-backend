package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "qc_cutting_headers")
@Data
public class QcCuttingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cutting_header_id")
    private Integer cuttingHeaderId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private ProductionOrder productionOrder;

    @ManyToOne
    @JoinColumn(name = "inspector_id", nullable = false)
    private User inspector;

    @Column(name = "lot_number", nullable = false)
    private String lotNumber;

    @Column(name = "operator_name", nullable = false)
    private String operatorName;

    @Column(name = "inspect_date", nullable = false)
    private Date inspectDate;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;
}