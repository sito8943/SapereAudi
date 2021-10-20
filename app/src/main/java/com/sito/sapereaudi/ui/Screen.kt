package com.sito.sapereaudi.ui

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object History : Screen("history_screen")
    object Lessons : Screen("lesson_screen")
    object Natura : Screen("natura_screen")
    object Authors : Screen("author_screen")
    object LessonView : Screen("lesson")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
    }

}
