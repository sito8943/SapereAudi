package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.components.header.HeaderRow
import com.sito.sapereaudi.ui.components.layout.MenuColumn

@Composable
fun LessonView(navController: NavController) {
    MenuColumn {
        HeaderRow(
            backOn = "main_screen",
            navController = navController,
            text = stringResource(id = R.string.lessonsTitle)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            createLesson(35)
        }
    }
}

@Composable
fun createLesson(max: Int) {
    var i = 0
    while (i < max) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp, horizontal = 15.dp)
        ) {
            Text(
                text = ("Lección $i")
            )
        }
        i++
    } //while
}