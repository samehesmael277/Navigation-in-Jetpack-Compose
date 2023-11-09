package com.sameh.jetpackcomposenavigation

sealed class Screen(val route: String) {

    object MainScreen: Screen("main_screen")

    object DetailsScreen: Screen("details_screen") {
        fun defaultValue(s : String = "sameh"): String {
            return "$route/$s"
        }
    }

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
