package com.sito.sapereaudi.ui.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sito.sapereaudi.R
import com.sito.sapereaudi.ui.Screen
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
            createLesson(35, navController)
        }
    }
}

@Composable
fun createLesson(max: Int, navController: NavController) {
    var i = 0
    var lessonList = ArrayList<Int>()
    while (i < max) {
        lessonList.add(i + 1)
        i++
    } //while
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 5.dp, horizontal = 15.dp)
    ) {
        items(items = lessonList, itemContent = { item ->
            TextButton(
                modifier = Modifier.padding(vertical = 10.dp, horizontal = 15.dp),
                onClick = {
                    navController.navigate(Screen.LessonView.withArgs(item.toString()))
                },
            ) {
                Text(
                    text = ("Lección$item"),
                    fontSize = 25.sp,
                    color = Color.White
                )
            }
        })
    }
}