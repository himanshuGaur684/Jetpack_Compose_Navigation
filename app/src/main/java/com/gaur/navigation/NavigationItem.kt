package com.gaur.navigation

sealed class NavigationItem(val route:String){

    object Home:NavigationItem("home")
    object Details: NavigationItem("details/{name}")

}
