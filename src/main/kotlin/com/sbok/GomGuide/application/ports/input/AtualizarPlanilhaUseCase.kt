package com.sbok.GomGuide.application.ports.input

import com.sbok.GomGuide.domain.model.DadosPlanilha

interface AtualizarPlanilhaUseCase {
    fun atualizarPlanilha(id: String, entrada: List<DadosPlanilha>)
}