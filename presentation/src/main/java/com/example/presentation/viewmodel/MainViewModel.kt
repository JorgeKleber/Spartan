package com.example.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.ExercicioDTO
import com.example.data.model.TreinoDTO
import com.example.data.repository.TreinoRepositoryImpl
import com.example.domain.repository.TreinoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: TreinoRepository
) : ViewModel() {

    private val _treinos = MutableStateFlow(emptyList<TreinoDTO>())
    val treinos : StateFlow<List<TreinoDTO>> = _treinos

    private val _exercicios = MutableStateFlow(emptyList<ExercicioDTO>())
    val exercicios : StateFlow<List<ExercicioDTO>> = _exercicios

//    init {
//        viewModelScope.launch {
//            repository.treinos.collect{ treino ->
//                _treinos.value = treino
//            }
//
//            repository.exercicios.collect { exercicio ->
//                _exercicios.value = exercicio
//            }
//        }
//    }

}