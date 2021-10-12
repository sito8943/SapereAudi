package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.ButtonImage
import com.sito.sapereaudi.ui.components.ButtonRow
import com.sito.sapereaudi.ui.components.ButtonText
import com.sito.sapereaudi.ui.theme.ButtonSalmon
import com.sito.sapereaudi.ui.theme.Salmon

@Composable
fun MainMenu(onClick: (Int) -> Unit?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Salmon),
        verticalArrangement = Arrangement.SpaceAround
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
                    .background(color = ButtonSalmon)
                    .size(width = 250.dp, height = 70.dp),
                onClick = { onClick(0) }) {
                ButtonRow() {
                    ButtonImage(
                        painter = painterResource(id = R.drawable.book),
                    )
                    ButtonText(
                        text = stringResource(id = R.string.historyButton),
                    )
                }
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
                    .background(color = Color.Blue)
                    .size(width = 250.dp, height = 70.dp),
                onClick = { /*TODO*/ }) {
                ButtonRow() {
                    ButtonImage(
                        painter = painterResource(id = R.drawable.mynotebook),
                    )
                    ButtonText(
                        text = stringResource(id = R.string.lessonsButton),
                    )
                }
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
                    .background(color = Color.Blue)
                    .size(width = 250.dp, height = 70.dp),
                onClick = { /*TODO*/ }) {
                ButtonRow() {
                    ButtonImage(
                        painter = painterResource(id = R.drawable.writemachine),
                    )
                    Text(
                        text = stringResource(id = R.string.naturaButton),
                    )
                }
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
                    .background(color = Color.Blue)
                    .size(width = 250.dp, height = 70.dp),
                onClick = { /*TODO*/ }) {
                ButtonRow() {
                    ButtonImage(
                        painter = painterResource(id = R.drawable.portrait),
                    )
                    Text(
                        text = stringResource(id = R.string.authorsButton),
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ShowMainMenu() {
    MainMenu()
}