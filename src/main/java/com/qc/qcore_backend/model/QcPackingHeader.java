package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "qc_packing_headers")
@Data
public class QcPackingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "packing_header_id")
    private Integer packingHeaderId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private ProductionOrder productionOrder;

    @ManyToOne
    @JoinColumn(name = "inspector_id", nullable = false)
    private User inspector;

    @Column(name = "carton_number", nullable = false, length = 50)
    private String cartonNumber;

    @Column(name = "polybag_condition", length = 50)
    private String polybagCondition;

    @Column(name = "barcode_check")
    private Boolean barcodeCheck = true;

    @Column(name = "inspect_date", nullable = false)
    private Date inspectDate;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;
}
