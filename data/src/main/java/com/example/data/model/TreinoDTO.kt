package com.example.data.model

import com.example.domain.entity.Treino
import java.time.LocalDateTime

data class TreinoDTO(
    val id: Int,
    val nome: String,
    val exercicios: List<ExercicioDTO>
) {
    fun toTreino(): Treino = Treino(id, nome, exercicios.map { it.toExercicio() })
}
