package com.example.data.model

import com.example.domain.entity.Exercicio

data class ExercicioDTO(
    val id: Int,
    val titulo: String,
    val descricao: String,
    val maquina: Int,
    val repeticoes: Int,
    val series: Int,
    val tempo: Int,
    val treino: Int,
    val peso: Int
) {
    fun toExercicio(): Exercicio =
        Exercicio(id, titulo, descricao, maquina, repeticoes, series, tempo, treino, peso)
}
