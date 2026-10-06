package com.qc.qcore_backend.controller;

import com.qc.qcore_backend.model.QcFinishingHeader;
import com.qc.qcore_backend.model.QcFinishingDetail;
import com.qc.qcore_backend.repository.QcFinishingHeaderRepository;
import com.qc.qcore_backend.repository.QcFinishingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/qc/finishing")
@CrossOrigin(origins = "*")
public class QcFinishingController {

    @Autowired
    private QcFinishingHeaderRepository headerRepository;

    @Autowired
    private QcFinishingDetailRepository detailRepository;

    // --- Endpoint Header ---

    @GetMapping("/headers")
    public List<QcFinishingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    @GetMapping("/headers/{id}")
    public Optional<QcFinishingHeader> getHeaderById(@PathVariable Integer id) {
        return headerRepository.findById(id);
    }

    @PostMapping("/headers")
    public QcFinishingHeader createHeader(@RequestBody QcFinishingHeader header) {
        return headerRepository.save(header);
    }

    @DeleteMapping("/headers/{id}")
    public void deleteHeader(@PathVariable Integer id) {
        headerRepository.deleteById(id);
    }

    // --- Endpoint Detail Defect ---

    @GetMapping("/details/header/{headerId}")
    public List<QcFinishingDetail> getDetailsByHeaderId(@PathVariable Integer headerId) {
        return detailRepository.findByFinishingHeaderFinishingHeaderId(headerId);
    }

    @PostMapping("/details")
    public QcFinishingDetail createDetail(@RequestBody QcFinishingDetail detail) {
        return detailRepository.save(detail);
    }

    @DeleteMapping("/details/{id}")
    public void deleteDetail(@PathVariable Integer id) {
        detailRepository.deleteById(id);
    }
}