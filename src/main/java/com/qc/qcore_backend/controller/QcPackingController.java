package com.qc.qcore_backend.controller;

import com.qc.qcore_backend.model.QcPackingHeader;
import com.qc.qcore_backend.model.QcPackingDetail;
import com.qc.qcore_backend.repository.QcPackingHeaderRepository;
import com.qc.qcore_backend.repository.QcPackingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/qc/packing")
@CrossOrigin(origins = "*")
public class QcPackingController {

    @Autowired
    private QcPackingHeaderRepository headerRepository;

    @Autowired
    private QcPackingDetailRepository detailRepository;

    // --- Endpoint Header ---

    @GetMapping("/headers")
    public List<QcPackingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    @GetMapping("/headers/{id}")
    public Optional<QcPackingHeader> getHeaderById(@PathVariable Integer id) {
        return headerRepository.findById(id);
    }

    @PostMapping("/headers")
    public QcPackingHeader createHeader(@RequestBody QcPackingHeader header) {
        return headerRepository.save(header);
    }

    @DeleteMapping("/headers/{id}")
    public void deleteHeader(@PathVariable Integer id) {
        headerRepository.deleteById(id);
    }

    // --- Endpoint Detail Defect ---

    @GetMapping("/details/header/{headerId}")
    public List<QcPackingDetail> getDetailsByHeaderId(@PathVariable Integer headerId) {
        return detailRepository.findByPackingHeaderPackingHeaderId(headerId);
    }

    @PostMapping("/details")
    public QcPackingDetail createDetail(@RequestBody QcPackingDetail detail) {
        return detailRepository.save(detail);
    }

    @DeleteMapping("/details/{id}")
    public void deleteDetail(@PathVariable Integer id) {
        detailRepository.deleteById(id);
    }
}