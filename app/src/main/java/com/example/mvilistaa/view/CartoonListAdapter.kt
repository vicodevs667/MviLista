package com.example.mvilistaa.view

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvilistaa.model.Cartoon

//Debes heredar de un adapter de recycler
//view para que se comporte como tal
class CartoonListAdapter(
    private val cartoons: List<Cartoon>
): RecyclerView.Adapter<CartoonListAdapter.DataViewHolder>() {
    //vista que recibe
    //se supone que es el layout a dibujar
    //tienen que heredar de la clase abstracta
    //ViewHolder del RecyclerView
    class DataViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}