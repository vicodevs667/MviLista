package com.example.mvilistaa.api

import com.example.mvilistaa.model.Cartoon
import retrofit2.http.GET

//Definir los tipos de llamadas
//o tipos de peticiones a tu API
interface CartoonApi {
    //Parametro del decorador GET =
    //terminación de url, punto final de url,
    // fin de link, el ultimo termino de la ruta
    //a la API y al end point en especifico.
    //referencia al end point
    @GET("character")
    suspend fun getCharacters(): List<Cartoon>

    //suspend -> cuando funcion va a ser
    //invocada, implementada, aplicada
    //en el ambito de corrutinas

    //Ejemplo
    @GET("location")
    suspend fun getLocations(): List<String>
    //String es fake xq no hay objeto Location

}












