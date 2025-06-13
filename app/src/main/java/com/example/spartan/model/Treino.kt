package com.example.spartan.model

import java.time.LocalDateTime

data class Treino(
    val id: Int,
    val nome: String,
    val duracao: LocalDateTime
)
