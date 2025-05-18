package com.sbok.GomGuide.application.ports.input

import com.sbok.GomGuide.domain.model.DadosPlanilha

interface BuscarPlanilhaUseCase {
    fun buscarPlanilha(id:String): List<DadosPlanilha>
}