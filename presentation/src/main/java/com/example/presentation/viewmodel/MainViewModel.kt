package com.example.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.ExercicioDTO
import com.example.data.model.TreinoDTO
import com.example.data.repository.local.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val repository = RepositoryImpl()// forma errada de fazer isso.

    private val _treinos = MutableStateFlow(emptyList<TreinoDTO>())
    val treinos : StateFlow<List<TreinoDTO>> = _treinos

    private val _exercicios = MutableStateFlow(emptyList<ExercicioDTO>())
    val exercicios : StateFlow<List<ExercicioDTO>> = _exercicios

    init {
        viewModelScope.launch {
            repository.treinos.collect{ treino ->
                _treinos.value = treino
            }

            repository.exercicios.collect { exercicio ->
                _exercicios.value = exercicio
            }
        }
    }

}