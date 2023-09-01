package com.redhat.leeds.application.service;

import com.redhat.leeds.api.dto.LeedDTO;
import com.redhat.leeds.application.model.Leed;
import org.springframework.stereotype.Service;

@Service
public class LeedsService {
    public Leed processaNovoLeed(LeedDTO leedDTO) {
        return Leed.builder()
                .id(1L)
                .nome(leedDTO.getNome())
                .email(leedDTO.getEmail())
                .whatsApp(leedDTO.getWhatsApp())
                .cidade(leedDTO.getCidade())
                .build();
    }
}
