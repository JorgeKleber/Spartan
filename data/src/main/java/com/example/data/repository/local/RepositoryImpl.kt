package com.example.data.repository.local

import com.example.data.model.ExercicioDTO
import com.example.data.model.TreinoDTO
import com.example.data.repository.Repository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.LocalDateTime

class RepositoryImpl : Repository {

    companion object {
        private val _treinos = MutableStateFlow(
            mutableListOf<TreinoDTO>(
                TreinoDTO(
                    id = 1,
                    nome = "Treino 1",
                    duracao = LocalDateTime.now()
                ),
            )
        )

        private val _exercicios = MutableStateFlow(
            mutableListOf<ExercicioDTO>(
                ExercicioDTO(
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

    val treinos : StateFlow<MutableList<TreinoDTO>> = _treinos.asStateFlow()
    val exercicios : StateFlow<MutableList<ExercicioDTO>> = _exercicios.asStateFlow()

    override fun criarNovoTreino(treino: TreinoDTO) {
        val currentList = _treinos.value.toMutableList()
        currentList.add(treino)
        _treinos.value = currentList
    }

    override fun criarNovoExercicio(exercicio: ExercicioDTO) {
        val currentList = _exercicios.value.toMutableList()
        currentList.add(exercicio)
        _exercicios.value = currentList
    }

    override fun addNovoExercicio(exercicio: ExercicioDTO) {
        val currentList = _exercicios.value.toMutableList()
        currentList.add(exercicio)
        _exercicios.value = currentList
    }

    override fun listarTreinos(): List<TreinoDTO> = _treinos.value

    override fun listarExercicios(treinoId: Int): List<ExercicioDTO> = _exercicios.value.filter { it.treino == treinoId }
}