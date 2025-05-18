package com.sbok.GomGuide.adapter.inbound

import com.sbok.GomGuide.application.ports.input.AtualizarPlanilhaUseCase
import com.sbok.GomGuide.application.ports.input.BuscarPlanilhaUseCase
import com.sbok.GomGuide.application.ports.input.CriarPlanilhaUseCase
import com.sbok.GomGuide.domain.model.DadosPlanilha
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/planilha")
class PlanilhaController(
    private val criar: CriarPlanilhaUseCase,
    private val atualizar: AtualizarPlanilhaUseCase,
    private val buscar: BuscarPlanilhaUseCase
) {
    @PostMapping
    fun criar(@RequestParam usuarioId: String): String {
        return criar.criarPlanilha(usuarioId)
    }

    @PutMapping("/{planilhaId}")
    fun atualizar(@PathVariable planilhaId: String, @RequestBody entradas: List<DadosPlanilha>) {
        atualizar.atualizarPlanilha(planilhaId, entradas)
    }

    @GetMapping("/{planilhaId}")
    fun buscar(@PathVariable planilhaId: String): List<DadosPlanilha> {
        return buscar.buscarPlanilha(planilhaId)
    }
}