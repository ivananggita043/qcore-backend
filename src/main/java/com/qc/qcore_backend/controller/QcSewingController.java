package com.qc.qcore_backend.controller;

import com.qc.qcore_backend.model.QcSewingHeader;
import com.qc.qcore_backend.model.QcSewingDetail;
import com.qc.qcore_backend.repository.QcSewingHeaderRepository;
import com.qc.qcore_backend.repository.QcSewingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/qc/sewing")
@CrossOrigin(origins = "*")
public class QcSewingController {

    @Autowired
    private QcSewingHeaderRepository headerRepository;

    @Autowired
    private QcSewingDetailRepository detailRepository;

    // --- Endpoint untuk Header ---

    @GetMapping("/headers")
    public List<QcSewingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    @GetMapping("/headers/{id}")
    public Optional<QcSewingHeader> getHeaderById(@PathVariable Integer id) {
        return headerRepository.findById(id);
    }

    @PostMapping("/headers")
    public QcSewingHeader createHeader(@RequestBody QcSewingHeader header) {
        return headerRepository.save(header);
    }

    @DeleteMapping("/headers/{id}")
    public void deleteHeader(@PathVariable Integer id) {
        headerRepository.deleteById(id);
    }

    // --- Endpoint untuk Detail Defect ---

    @GetMapping("/details/header/{headerId}")
    public List<QcSewingDetail> getDetailsByHeaderId(@PathVariable Integer headerId) {
        return detailRepository.findBySewingHeaderSewingHeaderId(headerId);
    }

    @PostMapping("/details")
    public QcSewingDetail createDetail(@RequestBody QcSewingDetail detail) {
        return detailRepository.save(detail);
    }

    @DeleteMapping("/details/{id}")
    public void deleteDetail(@PathVariable Integer id) {
        detailRepository.deleteById(id);
    }
}