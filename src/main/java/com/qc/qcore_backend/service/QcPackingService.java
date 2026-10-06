package com.qc.qcore_backend.service;

import com.qc.qcore_backend.model.QcPackingHeader;
import com.qc.qcore_backend.model.QcPackingDetail;
import com.qc.qcore_backend.repository.QcPackingHeaderRepository;
import com.qc.qcore_backend.repository.QcPackingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class QcPackingService {

    @Autowired
    private QcPackingHeaderRepository headerRepository;

    @Autowired
    private QcPackingDetailRepository detailRepository;

    public List<QcPackingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    public Optional<QcPackingHeader> getHeaderById(Integer id) {
        return headerRepository.findById(id);
    }

    @Transactional
    public QcPackingHeader saveHeader(QcPackingHeader header) {
        return headerRepository.save(header);
    }

    @Transactional
    public void deleteHeader(Integer id) {
        headerRepository.deleteById(id);
    }

    public List<QcPackingDetail> getDetailsByHeaderId(Integer headerId) {
        return detailRepository.findByPackingHeaderPackingHeaderId(headerId);
    }

    @Transactional
    public QcPackingDetail saveDetail(QcPackingDetail detail) {
        return detailRepository.save(detail);
    }

    @Transactional
    public void deleteDetail(Integer id) {
        detailRepository.deleteById(id);
    }
}