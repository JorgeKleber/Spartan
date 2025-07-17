package com.example.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentation.R

@Composable
fun CardOption(
    imageResource: Painter,
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    clickEvent: () -> Unit
) {
    Card(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth(),
        onClick = clickEvent
    ) {
        Box {
            Image(
                painter = imageResource,
                contentScale = ContentScale.Crop,
                contentDescription = "Treino",
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    title,
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = modifier.padding(10.dp, 10.dp, 10.dp, 0.dp)
                )
                Text(
                    description,
                    color = Color.White,
                    modifier = modifier.padding(10.dp, 0.dp, 10.dp, 10.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun CardOptionPreview() {
    CardOption(
        imageResource = painterResource(id = R.drawable.treino_background),
        title = "Treino",
        description = "Descrição do treino",
        clickEvent = {}
    )
}