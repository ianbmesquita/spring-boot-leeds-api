package com.redhat.leeds.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LeedDTO {
    private String nome;
    private String email;
    private String whatsApp;
    private String cidade;
}
