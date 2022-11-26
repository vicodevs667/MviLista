package com.example.mvilistaa.api

class CartoonRepo(
    private val api: CartoonApi) {

    suspend fun getCartoons() = api.getCharacters()

    //Referencia
    suspend fun getLocations() {
        // if (si tienes conexion)
        // return api.getLocations()
        //else return room.getLocations()
        //Si tienes permisos
    }

}










