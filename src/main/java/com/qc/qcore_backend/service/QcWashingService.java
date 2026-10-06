package com.qc.qcore_backend.service;

import com.qc.qcore_backend.model.QcWashingHeader;
import com.qc.qcore_backend.model.QcWashingDetail;
import com.qc.qcore_backend.repository.QcWashingHeaderRepository;
import com.qc.qcore_backend.repository.QcWashingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class QcWashingService {

    @Autowired
    private QcWashingHeaderRepository headerRepository;

    @Autowired
    private QcWashingDetailRepository detailRepository;

    public List<QcWashingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    public Optional<QcWashingHeader> getHeaderById(Integer id) {
        return headerRepository.findById(id);
    }

    @Transactional
    public QcWashingHeader saveHeader(QcWashingHeader header) {
        return headerRepository.save(header);
    }

    @Transactional
    public void deleteHeader(Integer id) {
        headerRepository.deleteById(id);
    }

    public List<QcWashingDetail> getDetailsByHeaderId(Integer headerId) {
        return detailRepository.findByWashingHeaderWashingHeaderId(headerId);
    }

    @Transactional
    public QcWashingDetail saveDetail(QcWashingDetail detail) {
        return detailRepository.save(detail);
    }

    @Transactional
    public void deleteDetail(Integer id) {
        detailRepository.deleteById(id);
    }
}