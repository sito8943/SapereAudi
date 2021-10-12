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
import androidx.compose.ui.unit.sp
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.theme.DarkBlue
import com.sito.sapereaudi.ui.theme.Salmon

@Composable
fun MainMenu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Salmon),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 25.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.appTitle),
                color = Color.White,
                fontSize = 50.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = DarkBlue),
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = Color.Blue),
                onClick = { /*TODO*/ }) {
                Image(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.writemachine),
                    contentDescription = ""
                )
                Text(
                    modifier = Modifier.padding(5.dp),
                    text = stringResource(id = R.string.naturaButton)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = Color.Blue),
                onClick = { /*TODO*/ }) {
                Image(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = R.drawable.portrait),
                    contentDescription = ""
                )
                Text(
                    modifier = Modifier.padding(5.dp),
                    text = stringResource(id = R.string.authorsButton)
                )
            }
        }
    }
}

@Preview
@Composable
fun ShowMainMenu() {
    MainMenu()
}