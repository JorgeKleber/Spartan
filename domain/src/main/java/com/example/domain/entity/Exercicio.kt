package com.example.domain.entity

data class Exercicio(
    val id: Int,
    val titulo: String,
    val descricao: String,
    val maquina: Int,
    val repeticoes: Int,
    val series: Int,
    val tempo: Int,
    val treino: Int,
    val peso: Int
)
