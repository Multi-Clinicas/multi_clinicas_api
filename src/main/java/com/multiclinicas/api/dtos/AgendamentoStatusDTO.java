package com.multiclinicas.api.dtos;

import com.multiclinicas.api.models.enums.StatusAgendamento;

import jakarta.validation.constraints.NotNull;

public record AgendamentoStatusDTO(
        @NotNull(message = "O novo status é obrigatório") StatusAgendamento novoStatus) {
}
