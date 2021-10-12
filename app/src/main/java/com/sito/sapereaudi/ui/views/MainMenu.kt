package com.sito.sapereaudi.ui.views

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
import com.sito.sapereaudi.ui.components.button.ButtonImage
import com.sito.sapereaudi.ui.components.button.ButtonRow
import com.sito.sapereaudi.ui.components.button.ButtonText
import com.sito.sapereaudi.ui.components.header.Header
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn
import com.sito.sapereaudi.ui.components.layout.MenuRow
import com.sito.sapereaudi.ui.theme.ButtonSalmon

@Composable
fun MainMenu(onClick: (Int) -> Unit?) {
    MenuColumn {
        HeaderRow {
            Header(
                text = stringResource(id = R.string.appTitle),
            )
        }
        MenuRow {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = ButtonSalmon)
                    .size(width = 250.dp, height = 70.dp),
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
                    .background(color = Color.Blue)
                    .size(width = 250.dp, height = 70.dp),
                onClick = { /*TODO*/ }) {
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
                    .background(color = Color.Blue)
                    .size(width = 250.dp, height = 70.dp),
                onClick = { /*TODO*/ }) {
                ButtonRow {
                    ButtonImage(
                        painter = painterResource(id = R.drawable.writemachine),
                    )
                    Text(
                        text = stringResource(id = R.string.naturaButton),
                    )
                }
            }
        }
        MenuRow {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .background(color = Color.Blue)
                    .size(width = 250.dp, height = 70.dp),
                onClick = { /*TODO*/ }) {
                ButtonRow {
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