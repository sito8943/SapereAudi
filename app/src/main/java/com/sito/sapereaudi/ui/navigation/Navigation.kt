package com.sito.sapereaudi.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.sito.sapereaudi.ui.Screen
import com.sito.sapereaudi.ui.views.*

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainMenu(onClick = fun(who: Int) {
                when (who) {
                    0 -> {
                        navController.navigate(Screen.History.route)
                    }
                    1 -> {
                        navController.navigate(Screen.Lessons.route)
                    }
                    2 -> {
                        navController.navigate(Screen.Natura.route)
                    }
                    3 -> {
                        navController.navigate(Screen.Authors.route)
                    }
                } //when
            }, navController = navController)
        }
        composable(route = Screen.History.route) {
            HistoryView(navController = navController)
        }
        composable(route = Screen.Lessons.route) {
            LessonView(navController = navController)
        }
        composable(route = Screen.Natura.route) {
            NaturaView(navController = navController)
        }
        composable(route = Screen.Authors.route) {
            AuthorsView(navController = navController)
        }
        composable(route = Screen.LessonView.route + "/{string}",
         arguments = listOf(
                navArgument("lesson") {
                    type = NavType.IntType
                    defaultValue = 1
                    nullable = true
                }
         )
        ) { entry ->
            entry.arguments?.getInt("lesson")?.let { LessonPage(lesson = it, navController = navController) }
        }
    }
}