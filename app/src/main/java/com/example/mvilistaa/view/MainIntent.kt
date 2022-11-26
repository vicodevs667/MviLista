package com.example.mvilistaa.view

//Abstraccion de las posibles interacciones
//del usuario con el sistema
//*** existe la posibilidad de tener mas archivos de tipo Intent***
//Abstraccion = representaciones de la realidad
//sin definir toda la logica de accion
sealed class MainIntent {
    object FetchCartoons: MainIntent()
}












