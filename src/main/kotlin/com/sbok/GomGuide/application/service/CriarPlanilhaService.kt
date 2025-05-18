package com.sbok.GomGuide.application.service

import com.sbok.GomGuide.application.ports.input.CriarPlanilhaUseCase
import com.sbok.GomGuide.application.ports.output.GoogleSheetsClient

class CriarPlanilhaService(
    private val googleSheetsClient: GoogleSheetsClient
): CriarPlanilhaUseCase {
    override fun criarPlanilha(usuarioId: String): String {
        return googleSheetsClient.criarPlanilha(usuarioId)
    }
}