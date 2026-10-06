package com.qc.qcore_backend.service;

import com.qc.qcore_backend.model.QcCuttingHeader;
import com.qc.qcore_backend.model.QcCuttingProcess;
import com.qc.qcore_backend.model.QcCuttingPanel;
import com.qc.qcore_backend.repository.QcCuttingHeaderRepository;
import com.qc.qcore_backend.repository.QcCuttingProcessRepository;
import com.qc.qcore_backend.repository.QcCuttingPanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class QcCuttingService {

    @Autowired
    private QcCuttingHeaderRepository headerRepository;

    @Autowired
    private QcCuttingProcessRepository processRepository;

    @Autowired
    private QcCuttingPanelRepository panelRepository;

    // Header logic
    public List<QcCuttingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    public Optional<QcCuttingHeader> getHeaderById(Integer id) {
        return headerRepository.findById(id);
    }

    @Transactional
    public QcCuttingHeader saveHeader(QcCuttingHeader header) {
        return headerRepository.save(header);
    }

    @Transactional
    public void deleteHeader(Integer id) {
        headerRepository.deleteById(id);
    }

    // Process logic
    public List<QcCuttingProcess> getProcessesByHeaderId(Integer headerId) {
        return processRepository.findByCuttingHeaderCuttingHeaderId(headerId);
    }

    @Transactional
    public QcCuttingProcess saveProcess(QcCuttingProcess process) {
        return processRepository.save(process);
    }

    @Transactional
    public void deleteProcess(Integer id) {
        processRepository.deleteById(id);
    }

    // Panel logic
    public List<QcCuttingPanel> getPanelsByProcessId(Integer processId) {
        return panelRepository.findByCuttingProcessCuttingProcessId(processId);
    }

    @Transactional
    public QcCuttingPanel savePanel(QcCuttingPanel panel) {
        return panelRepository.save(panel);
    }

    @Transactional
    public void deletePanel(Integer id) {
        panelRepository.deleteById(id);
    }
}