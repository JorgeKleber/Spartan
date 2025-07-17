package com.example.data.model

import com.example.domain.entity.Treino
import java.time.LocalDateTime

data class TreinoDTO(
    val id: Int,
    val nome: String,
    val duracao: LocalDateTime
){
    fun toTreino(): Treino = Treino(id, nome, duracao)
}
