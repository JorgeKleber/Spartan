package com.example.presentation.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.presentation.R
import com.example.presentation.components.CardOption
import com.example.presentation.view.ui.theme.SpartanTheme
import com.example.presentation.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onNavigateTo: () -> Unit,
    viewModel: MainViewModel = hiltViewModel()
) {
    SpartanTheme {
        Surface {
            Scaffold { innerPadding ->
                Column {
                    TopMenu(modifier = Modifier.padding(innerPadding))
                    MyOptionsList(
                        modifier = Modifier.padding(innerPadding),
                        navigation = onNavigateTo
                    )
                }
            }
        }
    }
}


@Composable
fun TopMenu(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Menu",
            modifier = Modifier.padding(16.dp)
        )
        Text("Spartan")
        Card(
            modifier = Modifier
                .padding(5.dp)
                .height(45.dp)
                .width(45.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Menu",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun TopMenuPreviewer() {
    TopMenu(Modifier.fillMaxWidth())
}

@Composable
fun MyOptionsList(modifier: Modifier = Modifier, navigation: () -> Unit) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {

        CardOption(
            imageResource = painterResource(id = R.drawable.treino_background),
            title = "Treino",
            description = "Descrição do treino",
            clickEvent = navigation
        )

        CardOption(
            imageResource = painterResource(id = R.drawable.diario_de_treino),
            title = "Diario de treino",
            description = "Descrição do treino",
            clickEvent = navigation
        )

        CardOption(
            imageResource = painterResource(id = R.drawable.personal_treiner_background),
            title = "Personal Trainer",
            description = "Descrição do treino",
            clickEvent = navigation
        )

        CardOption(
            imageResource = painterResource(id = R.drawable.academias_background),
            title = "Academias",
            description = "Descrição do treino",
            clickEvent = navigation

        )
    }
}