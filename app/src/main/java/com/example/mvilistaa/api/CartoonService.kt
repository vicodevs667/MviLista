package com.example.mvilistaa.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Donde definen un "cliente" con toda
//la configuracion necesaria para crear
//una instancia de Retrofit que sepa
//resolver y consumir su API
object CartoonService {
    const val BASE_URL = "https://rickandmortyapi.com/api/"

    fun getRetrofitClient() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}









