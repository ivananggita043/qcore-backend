package com.qc.qcore_backend.controller;

import com.qc.qcore_backend.model.QcWashingHeader;
import com.qc.qcore_backend.model.QcWashingDetail;
import com.qc.qcore_backend.repository.QcWashingHeaderRepository;
import com.qc.qcore_backend.repository.QcWashingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/qc/washing")
@CrossOrigin(origins = "*")
public class QcWashingController {

    @Autowired
    private QcWashingHeaderRepository headerRepository;

    @Autowired
    private QcWashingDetailRepository detailRepository;

    // --- Endpoint Header ---

    @GetMapping("/headers")
    public List<QcWashingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    @GetMapping("/headers/{id}")
    public Optional<QcWashingHeader> getHeaderById(@PathVariable Integer id) {
        return headerRepository.findById(id);
    }

    @PostMapping("/headers")
    public QcWashingHeader createHeader(@RequestBody QcWashingHeader header) {
        return headerRepository.save(header);
    }

    @DeleteMapping("/headers/{id}")
    public void deleteHeader(@PathVariable Integer id) {
        headerRepository.deleteById(id);
    }

    // --- Endpoint Detail Defect ---

    @GetMapping("/details/header/{headerId}")
    public List<QcWashingDetail> getDetailsByHeaderId(@PathVariable Integer headerId) {
        return detailRepository.findByWashingHeaderWashingHeaderId(headerId);
    }

    @PostMapping("/details")
    public QcWashingDetail createDetail(@RequestBody QcWashingDetail detail) {
        return detailRepository.save(detail);
    }

    @DeleteMapping("/details/{id}")
    public void deleteDetail(@PathVariable Integer id) {
        detailRepository.deleteById(id);// cuma manggil, kurang service  
    }
}