package com.example.data.service

import com.example.domain.entity.Treino
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @GET("/")
    @Headers("Accept: application/json")
    suspend fun geraTreinoDeepSeek(): String

}