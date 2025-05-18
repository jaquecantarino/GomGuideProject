package com.sbok.GomGuide.application.ports.output

import com.sbok.GomGuide.domain.model.DadosPlanilha

interface GoogleSheetsClient {
    fun criarPlanilha(usuarioId: String): String

    fun atualizarPlanilha(id:String, entrada: List<DadosPlanilha>)

    fun buscarPlanilha(id: String): List<DadosPlanilha>
}