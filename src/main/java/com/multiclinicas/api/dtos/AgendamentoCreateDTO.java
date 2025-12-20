package com.multiclinicas.api.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

import com.multiclinicas.api.models.enums.TipoPagamento;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

public record AgendamentoCreateDTO(
                @NotNull(message = "O ID do paciente é obrigatório") Long pacienteId,

                @NotNull(message = "O ID do médico é obrigatório") Long medicoId,

                @NotNull(message = "A data da consulta é obrigatória") @FutureOrPresent(message = "A data da consulta deve ser hoje ou futura") LocalDate dataConsulta,

                @NotNull(message = "A hora de início é obrigatória") LocalTime horaInicio,

                @NotNull(message = "O tipo de pagamento é obrigatório") TipoPagamento tipoPagamento,

                Long planoSaudeId, // Opcional, apenas se for convênio

                String observacoes) {
}
