package com.sbok.GomGuide.application.service

import com.sbok.GomGuide.application.ports.input.BuscarPlanilhaUseCase
import com.sbok.GomGuide.application.ports.output.GoogleSheetsClient
import com.sbok.GomGuide.domain.model.DadosPlanilha

class BuscarPlanilhaService(
    private val googleSheetsClient: GoogleSheetsClient
): BuscarPlanilhaUseCase {
    override fun buscarPlanilha(id: String): List<DadosPlanilha> {
        return googleSheetsClient.buscarPlanilha(id)
    }
}