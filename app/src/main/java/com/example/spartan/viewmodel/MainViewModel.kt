package com.example.spartan.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.spartan.model.Exercicio
import com.example.spartan.model.Treino
import com.example.spartan.repository.local.RepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val repository = RepositoryImpl()// forma errada de fazer isso.

    private val _treinos = MutableStateFlow(emptyList<Treino>())
    val treinos : StateFlow<List<Treino>> = _treinos

    private val _exercicios = MutableStateFlow(emptyList<Exercicio>())
    val exercicios : StateFlow<List<Exercicio>> = _exercicios

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