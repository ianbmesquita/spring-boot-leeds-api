package com.redhat.leeds.api.controller;

import com.redhat.leeds.api.dto.LeedDTO;
import com.redhat.leeds.application.model.Leed;
import com.redhat.leeds.application.service.LeedsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/leeds")
public class LeedsController {
    @Autowired
    private LeedsService service;

    @GetMapping
    public List<String> getAllLeeds() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public String getLeedById(@PathVariable Long id) {
        return "Teste";
    }

    @PostMapping
    public ResponseEntity<Leed> saveNewLeed(@RequestBody LeedDTO leedDTO) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.processaNovoLeed(leedDTO));
    }
}
