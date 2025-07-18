package com.example.domain.repository

import com.example.domain.entity.Exercicio
import com.example.domain.entity.Treino

interface TreinoRepository {

    suspend fun solicitarTreino(parametros: String): Treino
    fun criarNovoTreino(treino: Treino)
    fun criarNovoExercicio(exercicio: Exercicio)
    fun addNovoExercicio(exercicio: Exercicio)
    fun listarTreinos(): List<Treino>
    fun listarExercicios(treinoId: Int): List<Exercicio>

}