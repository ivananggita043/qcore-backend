package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "qc_packing_details")
@Data
public class QcPackingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "packing_detail_id")
    private Integer packingDetailId;

    @ManyToOne
    @JoinColumn(name = "packing_header_id", nullable = false)
    private QcPackingHeader packingHeader;

    @Column(name = "defect_type", nullable = false, length = 100)
    private String defectType;

    @Column(name = "qty_inspected", nullable = false)
    private Integer qtyInspected = 0;

    @Column(name = "qty_defect", nullable = false)
    private Integer qtyDefect = 0;
}