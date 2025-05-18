package com.sbok.GomGuide.domain.model

data class DadosPlanilha(
    val participante: String,
    val user: String,
    val item: String,
    val valorItem: Double,
    val itemPago: Boolean,
    val valorFrete: Double,
    val fretePago: Boolean,
    val valorTaxa: Double,
    val taxaPaga: Boolean,
    val envioNacional: Boolean
)
