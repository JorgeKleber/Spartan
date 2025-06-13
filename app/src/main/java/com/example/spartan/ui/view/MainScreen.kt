package com.example.spartan.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spartan.R
import com.example.spartan.ui.theme.SpartanTheme
import com.example.spartan.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: MainViewModel) {
    SpartanTheme {
        Surface {
            Scaffold { innerPadding ->
                Column {
                    TopMenu(modifier = Modifier.padding(innerPadding))
                    MyOptionsList(modifier = Modifier.padding(innerPadding))
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

@Preview()
@Composable
fun MyOptionsList(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Card(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth()
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.treino_background),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Treino",
                    modifier = Modifier.fillMaxWidth()
                )
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        "Treino",
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = modifier.padding(10.dp, 10.dp, 10.dp, 0.dp)
                    )
                    Text(
                        "Sua lista de treinos",
                        color = Color.White,
                        modifier = modifier.padding(10.dp, 0.dp, 10.dp, 10.dp)
                    )
                }
            }
        }
    }
}