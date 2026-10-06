package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "qc_finishing_headers")
@Data
public class QcFinishingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "finishing_header_id")
    private Integer finishingHeaderId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private ProductionOrder productionOrder;

    @ManyToOne
    @JoinColumn(name = "inspector_id", nullable = false)
    private User inspector;

    @Column(name = "line_number", nullable = false, length = 20)
    private String lineNumber;

    @Column(name = "box_carton_number", nullable = false, length = 50)
    private String boxCartonNumber;

    @Column(name = "needle_detector_passed")
    private Boolean needleDetectorPassed = true;

    @Column(name = "inspect_date", nullable = false)
    private Date inspectDate;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;
}