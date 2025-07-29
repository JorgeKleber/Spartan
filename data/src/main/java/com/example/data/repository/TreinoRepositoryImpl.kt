package com.example.data.repository

import com.example.data.model.ExercicioDTO
import com.example.data.model.TreinoDTO
import com.example.data.service.ApiService
import com.example.domain.entity.Exercicio
import com.example.domain.entity.Treino
import com.example.domain.repository.TreinoRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import java.time.LocalDateTime

class TreinoRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : TreinoRepository {


    override suspend fun solicitarTreino(temaDoTreino: String): Treino {

//        val result = apiService.geraTreinoDeepSeek(
//            """
//            Gere um treino de academia em formato JSON com a seguinte estrutura:
//            {
//                "id": 0,
//                "nome": "string",
//                "exercicios": [
//                    {
//                        "id": 0,
//                        "nome": "string",
//                        "series": 0,
//                        "repeticoes": 0,
//                        "carga": 0.0
//                    }
//                ]
//            }
//
//            O tema do treino é: $temaDoTreino
//            """
//        )
//        return result

        TODO("Not yet implemented")
    }

    override fun criarNovoTreino(treino: Treino) {
        TODO("Not yet implemented")
    }

    override fun criarNovoExercicio(exercicio: Exercicio) {
        TODO("Not yet implemented")
    }

    override fun addNovoExercicio(exercicio: Exercicio) {
        TODO("Not yet implemented")
    }

    override fun listarTreinos(): List<Treino> {
        TODO("Not yet implemented")
    }

    override fun listarExercicios(treinoId: Int): List<Exercicio> {
        TODO("Not yet implemented")
    }
}