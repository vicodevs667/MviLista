package com.example.mvilistaa.view

import com.example.mvilistaa.model.Cartoon

sealed class MainState {
    object Idle: MainState()
    object Loading: MainState()
    //success data from service
    data class Cartoons(
        val cartoons: List<Cartoon>
        ): MainState()
    data class Error(val error: String?):
            MainState()
}








