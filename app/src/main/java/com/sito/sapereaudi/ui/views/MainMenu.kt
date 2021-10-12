package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sito.sapereaudi.R

@Composable
fun MainMenu() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = Color.Blue),
                onClick = { /*TODO*/ }) {
                Image(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.book),
                    contentDescription = ""
                )
                Text(
                    modifier = Modifier.padding(5.dp),
                    text = stringResource(id = R.string.historyButton)
                )
            }
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = Color.Blue),
                onClick = { /*TODO*/ }) {
                Image(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.mynotebook),
                    contentDescription = ""
                )
                Text(
                    modifier = Modifier.padding(5.dp),
                    text = stringResource(id = R.string.lessonsButton),
                    color = Color.White
                )
            }
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = Color.Blue),
                onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.writemachine),
                    contentDescription = ""
                )
                Text(text = stringResource(id = R.string.naturaButton))
            }
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = Color.Blue),
                onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.portrait), contentDescription = "")
                Text(text = stringResource(id = R.string.authorsButton))
            }
        }
    }
}

@Preview
@Composable
fun ShowMainMenu() {
    MainMenu()
}