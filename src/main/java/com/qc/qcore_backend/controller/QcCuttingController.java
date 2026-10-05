package com.qc.qcore_backend.controller;

import com.qc.qcore_backend.model.QcCuttingHeader;
import com.qc.qcore_backend.model.QcCuttingProcess;
import com.qc.qcore_backend.model.QcCuttingPanel;
import com.qc.qcore_backend.repository.QcCuttingHeaderRepository;
import com.qc.qcore_backend.repository.QcCuttingProcessRepository;
import com.qc.qcore_backend.repository.QcCuttingPanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/qc/cutting")
@CrossOrigin(origins = "*")
public class QcCuttingController {

    @Autowired
    private QcCuttingHeaderRepository headerRepository;

    @Autowired
    private QcCuttingProcessRepository processRepository;

    @Autowired
    private QcCuttingPanelRepository panelRepository;

    @GetMapping("/headers")
    public List<QcCuttingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    @GetMapping("/headers/{id}")
    public Optional<QcCuttingHeader> getHeaderById(@PathVariable Integer id) {
        return headerRepository.findById(id);
    }

    @PostMapping("/headers")
    public QcCuttingHeader createHeader(@RequestBody QcCuttingHeader header) {
        return headerRepository.save(header);
    }

    @DeleteMapping("/headers/{id}")
    public void deleteHeader(@PathVariable Integer id) {
        headerRepository.deleteById(id);
    }

    @GetMapping("/processes/header/{headerId}")
    public List<QcCuttingProcess> getProcessesByHeaderId(@PathVariable Integer headerId) {
        return processRepository.findByCuttingHeaderCuttingHeaderId(headerId);
    }

    @PostMapping("/processes")
    public QcCuttingProcess createProcess(@RequestBody QcCuttingProcess process) {
        return processRepository.save(process);
    }

    @DeleteMapping("/processes/{id}")
    public void deleteProcess(@PathVariable Integer id) {
        processRepository.deleteById(id);
    }

    @GetMapping("/panels/process/{processId}")
    public List<QcCuttingPanel> getPanelsByProcessId(@PathVariable Integer processId) {
        return panelRepository.findByCuttingProcessCuttingProcessId(processId);
    }

    @PostMapping("/panels")
    public QcCuttingPanel createPanel(@RequestBody QcCuttingPanel panel) {
        return panelRepository.save(panel);
    }

    @DeleteMapping("/panels/{id}")
    public void deletePanel(@PathVariable Integer id) {
        panelRepository.deleteById(id);
    }
}