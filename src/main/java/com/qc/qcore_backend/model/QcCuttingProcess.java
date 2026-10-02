package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "qc_cutting_processes")
@Data
public class QcCuttingProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cutting_process_id")
    private Integer cuttingProcessId;

    @ManyToOne
    @JoinColumn(name = "cutting_header_id", nullable = false)
    private QcCuttingHeader cuttingHeader;

    @Enumerated(EnumType.STRING)
    @Column(name = "process_stage", nullable = false)
    private ProcessStage processStage;

    @Enumerated(EnumType.STRING)
    @Column(name = "process_status", nullable = false)
    private ProcessStatus processStatus;

    @Column(name = "remarks")
    private String remarks;

    public enum ProcessStage {
        Marker, Fabric, Spreading, Cutting, Fuse, Bundle, Numbering
    }

    public enum ProcessStatus {
        PASS, REWORK, REJECT
    }
}