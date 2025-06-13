package com.example.spartan.repository.local

import com.example.spartan.model.Exercicio
import com.example.spartan.model.Treino
import com.example.spartan.repository.Repository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.LocalDateTime

class RepositoryImpl : Repository {

    companion object {
        private val _treinos = MutableStateFlow(
            mutableListOf<Treino>(
                Treino(
                    id = 1,
                    nome = "Treino 1",
                    duracao = LocalDateTime.now()
                ),
            )
        )

        private val _exercicios = MutableStateFlow(
            mutableListOf<Exercicio>(
                Exercicio(
                    id = 1,
                    titulo = "Exercicio 1",
                    descricao = "Descricao do exercicio 1",
                    maquina = 1,
                    repeticoes = 10,
                    series = 3,
                    tempo = 10,
                    peso = 1,
                    treino = 1
                )
            )
        )
    }

    val treinos : StateFlow<MutableList<Treino>> = _treinos.asStateFlow()
    val exercicios : StateFlow<MutableList<Exercicio>> = _exercicios.asStateFlow()

    override fun CriarNovoTreino(treino: Treino) {
        val currentList = _treinos.value.toMutableList()
        currentList.add(treino)
        _treinos.value = currentList
    }

    override fun CriarNovoExercicio(exercicio: Exercicio) {
        val currentList = _exercicios.value.toMutableList()
        currentList.add(exercicio)
        _exercicios.value = currentList
    }

    override fun AddNovoExercicio(exercicio: Exercicio) {
        val currentList = _exercicios.value.toMutableList()
        currentList.add(exercicio)
        _exercicios.value = currentList
    }

    override fun ListarTreinos(): List<Treino> = _treinos.value

    override fun ListarExercicios(treinoId: Int): List<Exercicio> = _exercicios.value.filter { it.treino == treinoId }
}