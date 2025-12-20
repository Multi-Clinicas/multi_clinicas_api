package com.multiclinicas.api.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

public record AgendamentoRemarcarDTO(
        @NotNull(message = "A nova data da consulta é obrigatória") @FutureOrPresent(message = "A data da consulta deve ser hoje ou futura") LocalDate novaDataConsulta,

        @NotNull(message = "A nova hora de início é obrigatória") LocalTime novaHoraInicio) {
}
