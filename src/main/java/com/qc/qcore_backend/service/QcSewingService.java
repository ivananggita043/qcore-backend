package com.qc.qcore_backend.service;

import com.qc.qcore_backend.model.QcSewingHeader;
import com.qc.qcore_backend.model.QcSewingDetail;
import com.qc.qcore_backend.repository.QcSewingHeaderRepository;
import com.qc.qcore_backend.repository.QcSewingDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class QcSewingService {

    @Autowired
    private QcSewingHeaderRepository headerRepository;

    @Autowired
    private QcSewingDetailRepository detailRepository;

    public List<QcSewingHeader> getAllHeaders() {
        return headerRepository.findAll();
    }

    public Optional<QcSewingHeader> getHeaderById(Integer id) {
        return headerRepository.findById(id);
    }

    @Transactional
    public QcSewingHeader saveHeader(QcSewingHeader header) {
        return headerRepository.save(header);
    }

    @Transactional
    public void deleteHeader(Integer id) {
        headerRepository.deleteById(id);
    }

    public List<QcSewingDetail> getDetailsByHeaderId(Integer headerId) {
        return detailRepository.findBySewingHeaderSewingHeaderId(headerId);
    }

    @Transactional
    public QcSewingDetail saveDetail(QcSewingDetail detail) {
        return detailRepository.save(detail);
    }

    @Transactional
    public void deleteDetail(Integer id) {
        detailRepository.deleteById(id);
    }
}