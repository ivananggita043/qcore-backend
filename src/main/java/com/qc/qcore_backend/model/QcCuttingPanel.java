package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "qc_cutting_panels")
@Data
public class QcCuttingPanel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cutting_panel_id")
    private Integer cuttingPanelId;

    @ManyToOne
    @JoinColumn(name = "cutting_process_id", nullable = false)
    private QcCuttingProcess cuttingProcess;

    @Column(name = "panel_name", nullable = false)
    private String panelName;

    @Column(name = "qty_inspected", nullable = false)
    private Integer qtyInspected;

    @Column(name = "qty_defect", nullable = false)
    private Integer qtyDefect;

    @Column(name = "defect_description")
    private String defectDescription;
}