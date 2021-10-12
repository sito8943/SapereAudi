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
import com.sito.sapereaudi.ui.components.ButtonRow
import com.sito.sapereaudi.ui.theme.ButtonSalmon
import com.sito.sapereaudi.ui.theme.Salmon

@Composable
fun MainMenu(onClick:(Int)->Unit?) {
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
                onClick = { onClick(0)}) {
                ButtonRow() {
                    Image(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(width = 50.dp, height = 50.dp),
                        painter = painterResource(id = R.drawable.book),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = stringResource(id = R.string.historyButton),
                        color = Color.White,
                        fontSize = 14.sp
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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(width = 50.dp, height = 50.dp),
                        painter = painterResource(id = R.drawable.mynotebook),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = stringResource(id = R.string.lessonsButton),
                        color = Color.White,
                        fontSize = 14.sp
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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(width = 50.dp, height = 50.dp),
                        painter = painterResource(id = R.drawable.writemachine),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = stringResource(id = R.string.naturaButton),
                        color = Color.White,
                        fontSize = 14.sp
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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .padding(5.dp)
                            .size(width = 50.dp, height = 50.dp),
                        painter = painterResource(id = R.drawable.portrait),
                        contentDescription = ""
                    )
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = stringResource(id = R.string.authorsButton),
                        color = Color.White,
                        fontSize = 14.sp
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