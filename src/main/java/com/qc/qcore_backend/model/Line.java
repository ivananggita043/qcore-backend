package com.qc.qcore_backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "lines")
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_id")
    private Integer lineId;

    @Column(name = "line_number", nullable = false, unique = true, length = 20)
    private String lineNumber;

    @Column(name = "qty_inspected", nullable = false)
    private Integer qtyInspected = 0;

    @Column(name = "qty_defect", nullable = false)
    private Integer qtyDefect = 0;

    @Column(name = "updated_at", nullable = false, insertable = false, updatable = false)
    private LocalDateTime updatedAt;

    public Line() {
    }

    public Line(String lineNumber, Integer qtyInspected, Integer qtyDefect) {
        this.lineNumber = lineNumber;
        this.qtyInspected = qtyInspected;
        this.qtyDefect = qtyDefect;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Integer getQtyInspected() {
        return qtyInspected;
    }

    public void setQtyInspected(Integer qtyInspected) {
        this.qtyInspected = qtyInspected;
    }

    public Integer getQtyDefect() {
        return qtyDefect;
    }

    public void setQtyDefect(Integer qtyDefect) {
        this.qtyDefect = qtyDefect;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}