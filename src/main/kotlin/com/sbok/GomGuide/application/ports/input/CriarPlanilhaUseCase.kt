package com.sbok.GomGuide.application.ports.input

interface CriarPlanilhaUseCase {
    fun criarPlanilha(usuarioId: String): String
    //retorna ID da Planilha
}