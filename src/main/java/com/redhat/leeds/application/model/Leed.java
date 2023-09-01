package com.redhat.leeds.application.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Leed {
    private Long id;
    private String nome;
    private String email;
    private String whatsApp;
    private String cidade;
}
