package com.qc.qcore_backend.controller;

import com.qc.qcore_backend.model.Line;
import com.qc.qcore_backend.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/lines")
@CrossOrigin(origins = "*")
public class LineController {

    @Autowired
    private LineService lineService;

    @GetMapping
    public List<Line> getAllLines() {
        return lineService.getAllLines();
    }

    @GetMapping("/{id}")
    public Optional<Line> getLineById(@PathVariable Integer id) {
        return lineService.getLineById(id);
    }

    @PostMapping
    public Line createLine(@RequestBody Line line) {
        return lineService.saveLine(line);
    }

    @DeleteMapping("/{id}")
    public void deleteLine(@PathVariable Integer id) {
        lineService.deleteLine(id);
    }
}