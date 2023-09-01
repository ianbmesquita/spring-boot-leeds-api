package com.redhat.leeds.application.mapper;

import com.redhat.leeds.api.dto.LeedDTO;
import com.redhat.leeds.application.model.Leed;
import org.springframework.stereotype.Component;

@Component
public class LeedMapper {
    public Leed convertDTOToEntity(LeedDTO leedDTO) {
        return Leed.builder()
                .nome(leedDTO.getNome())
                .email(leedDTO.getEmail())
                .whatsApp(leedDTO.getWhatsApp())
                .cidade(leedDTO.getCidade())
                .build();
    }
}
