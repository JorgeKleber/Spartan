package com.example.data.service

import com.example.domain.entity.Treino
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @POST("/")
    @Headers(
        "Content-Type: application/json",
        "Authorization: Bearer YOUR_DEEPSEEK_API_KEY"
    )
    suspend fun geraTreinoDeepSeek(@Body prompt: String): Treino

}