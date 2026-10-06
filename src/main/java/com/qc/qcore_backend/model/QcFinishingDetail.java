package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "qc_finishing_details")
@Data
public class QcFinishingDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "finishing_detail_id")
    private Integer finishingDetailId;

    @ManyToOne
    @JoinColumn(name = "finishing_header_id", nullable = false)
    private QcFinishingHeader finishingHeader;

    @Column(name = "defect_area", nullable = false, length = 50)
    private String defectArea;

    @Column(name = "defect_type", nullable = false, length = 100)
    private String defectType;

    @Column(name = "qty_inspected", nullable = false)
    private Integer qtyInspected = 0;

    @Column(name = "qty_defect", nullable = false)
    private Integer qtyDefect = 0;
}