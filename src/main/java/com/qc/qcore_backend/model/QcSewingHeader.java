package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Entity
@Table(name = "qc_sewing_headers")
@Data
public class QcSewingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sewing_header_id")
    private Integer sewingHeaderId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private ProductionOrder productionOrder;

    @ManyToOne
    @JoinColumn(name = "inspector_id", nullable = false)
    private User inspector;

    @Column(name = "line_number", nullable = false, length = 20)
    private String lineNumber;

    @Column(name = "size", nullable = false, length = 10)
    private String size;

    @Column(name = "qty_transfer", nullable = false)
    private Integer qtyTransfer = 0;

    @Column(name = "inspect_date", nullable = false)
    private Timestamp inspectDate;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;
}