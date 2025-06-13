package com.example.spartan.repository

import com.example.spartan.model.Exercicio
import com.example.spartan.model.Treino

interface Repository {

    fun CriarNovoTreino(treino: Treino)
    fun CriarNovoExercicio(exercicio: Exercicio)
    fun AddNovoExercicio(exercicio: Exercicio)
    fun ListarTreinos(): List<Treino>
    fun ListarExercicios(treinoId: Int): List<Exercicio>

}