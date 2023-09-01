package com.redhat.leeds.api.controller;

import com.redhat.leeds.api.dto.LeedDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/leeds")
public class LeedsController {

    @GetMapping
    public List<String> getAllLeeds() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public String getLeedById(@PathVariable Long id) {
        return "Teste";
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String saveNewLeed(@RequestBody LeedDTO leedDTO) {
        return "Teste";
    }
}
