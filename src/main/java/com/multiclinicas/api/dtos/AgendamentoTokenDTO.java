package com.multiclinicas.api.dtos;

import jakarta.validation.constraints.NotBlank;

public record AgendamentoTokenDTO(
        @NotBlank(message = "O token não pode estar vazio") String tokenAutorizacao) {
}
