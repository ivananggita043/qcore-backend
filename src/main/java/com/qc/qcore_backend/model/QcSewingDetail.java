package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "qc_sewing_details")
@Data
public class QcSewingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sewing_detail_id")
    private Integer sewingDetailId;

    @ManyToOne
    @JoinColumn(name = "sewing_header_id", nullable = false)
    private QcSewingHeader sewingHeader;

    @Column(name = "defect", nullable = false, length = 50)
    private String defect;

    @Column(name = "defect_type", nullable = false, length = 100)
    private String defectType;

    @Column(name = "qty_inspected", nullable = false)
    private Integer qtyInspected = 0;

    @Column(name = "qty_defect", nullable = false)
    private Integer qtyDefect = 0;
}