package com.example.spartan.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.spartan.viewmodel.ListaDeTreinosViewModel

@Composable
fun ListaDeTreinosScreen(
    viewModel: ListaDeTreinosViewModel = hiltViewModel()
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Text("Lista de Treinos")
    }
}

@Preview(showBackground = true)
@Composable
fun ListaDeTreinosScreenPreview(){
    ListaDeTreinosScreen(CreateViewModel())
}

fun CreateViewModel() : ListaDeTreinosViewModel {
    return ListaDeTreinosViewModel()
}