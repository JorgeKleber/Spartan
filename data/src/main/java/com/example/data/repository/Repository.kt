package com.example.data.repository

import com.example.data.model.ExercicioDTO
import com.example.data.model.TreinoDTO

interface Repository {

    fun criarNovoTreino(treino: TreinoDTO)
    fun criarNovoExercicio(exercicio: ExercicioDTO)
    fun addNovoExercicio(exercicio: ExercicioDTO)
    fun listarTreinos(): List<TreinoDTO>
    fun listarExercicios(treinoId: Int): List<ExercicioDTO>

}