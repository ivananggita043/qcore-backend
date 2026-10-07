package com.qc.qcore_backend.repository;

import com.qc.qcore_backend.model.Line;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LineRepository extends JpaRepository<Line, Integer> {
    Optional<Line> findByLineNumber(String lineNumber);
}