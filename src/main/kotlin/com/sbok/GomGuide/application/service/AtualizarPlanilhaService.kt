package com.sbok.GomGuide.application.service

import com.sbok.GomGuide.application.ports.input.AtualizarPlanilhaUseCase
import com.sbok.GomGuide.application.ports.output.GoogleSheetsClient
import com.sbok.GomGuide.domain.model.DadosPlanilha

class AtualizarPlanilhaService(
    private val googleSheetsClient: GoogleSheetsClient
): AtualizarPlanilhaUseCase {
    override fun atualizarPlanilha(id: String, entrada: List<DadosPlanilha>) {
        googleSheetsClient.atualizarPlanilha(id, entrada)
    }
}