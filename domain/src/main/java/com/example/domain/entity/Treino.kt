package com.example.domain.entity

import java.time.LocalDateTime

data class Treino(
    val id: Int,
    val nome: String,
    val exercicios: List<Exercicio>
)
