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
fun HistoryView(navController: NavController) {
    MenuColumn {
        HeaderRow(
            backOn = "main_screen",
            navController = navController,
            text = stringResource(id = R.string.historyTitle)
        )
        MenuRow {
            Button(
                modifier = Modifier
                    .padding(5.dp)
                    .size(width = 250.dp, height = 70.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = ButtonSalmon),
                onClick = { navController.navigate("") }) {
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
    }
}