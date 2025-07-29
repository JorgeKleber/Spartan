package com.example.spartan.di

import com.example.data.repository.TreinoRepositoryImpl
import com.example.data.service.ApiService
import com.example.domain.repository.TreinoRepository
import com.example.presentation.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTreinoRepository(appService : ApiService) : TreinoRepository {
        return TreinoRepositoryImpl(appService)
    }


    @Provides
    @Singleton
    fun provideMainViewModel(treinoRepository : TreinoRepository) : MainViewModel {
        return MainViewModel(treinoRepository)
    }
}