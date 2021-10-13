package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.button.ButtonImage
import com.sito.sapereaudi.ui.components.button.ButtonRow
import com.sito.sapereaudi.ui.components.button.ButtonText
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn
import com.sito.sapereaudi.ui.components.layout.MenuRow
import com.sito.sapereaudi.ui.theme.ButtonSalmon

@Composable
fun MainMenu(onClick: (Int) -> Unit?, navController: NavController) {
    MenuColumn {
        HeaderRow(text = stringResource(id = R.string.appTitle))
        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            MenuRow {
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(width = 250.dp, height = 70.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = ButtonSalmon),
                    onClick = { onClick(0) }) {
                    ButtonRow {
                        ButtonImage(
                            painter = painterResource(id = R.drawable.book),
                        )
                        ButtonText(
                            text = stringResource(id = R.string.historyButton),
                        )
                    }
                }
            }
            MenuRow {
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(width = 250.dp, height = 70.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = ButtonSalmon),
                    onClick = { onClick(1) }) {
                    ButtonRow {
                        ButtonImage(
                            painter = painterResource(id = R.drawable.mynotebook),
                        )
                        ButtonText(
                            text = stringResource(id = R.string.lessonsButton),
                        )
                    }
                }
            }
            MenuRow {
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(width = 250.dp, height = 70.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = ButtonSalmon),
                    onClick = { onClick(2) }) {
                    ButtonRow {
                        ButtonImage(
                            painter = painterResource(id = R.drawable.writemachine),
                        )
                        ButtonText(
                            text = stringResource(id = R.string.naturaButton),
                        )
                    }
                }
            }
            MenuRow {
                Button(
                    modifier = Modifier
                        .padding(5.dp)
                        .size(width = 250.dp, height = 70.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = ButtonSalmon),
                    onClick = { onClick(3) }) {
                    ButtonRow {
                        ButtonImage(
                            painter = painterResource(id = R.drawable.portrait),
                        )
                        ButtonText(
                            text = stringResource(id = R.string.authorsButton),
                        )
                    }
                }
            }
        }
    }
}