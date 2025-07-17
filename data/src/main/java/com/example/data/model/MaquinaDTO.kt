package com.example.data.model

import com.example.domain.entity.Maquina

data class MaquinaDTO(
    val id: Int,
    val nome: String
){
    fun toMaquina(): Maquina = Maquina(id, nome)
}
