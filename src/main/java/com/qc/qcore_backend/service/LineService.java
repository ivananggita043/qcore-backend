package com.qc.qcore_backend.service;

import com.qc.qcore_backend.model.Line;
import com.qc.qcore_backend.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LineService {

    @Autowired
    private LineRepository lineRepository;

    public List<Line> getAllLines() {
        return lineRepository.findAll();
    }

    public Optional<Line> getLineById(Integer id) {
        return lineRepository.findById(id);
    }

    public Optional<Line> getLineByNumber(String lineNumber) {
        return lineRepository.findByLineNumber(lineNumber);
    }

    public Line saveLine(Line line) {
        return lineRepository.save(line);
    }

    public void deleteLine(Integer id) {
        lineRepository.deleteById(id);
    }
}