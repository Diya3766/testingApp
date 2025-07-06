package com.example.testingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val dataList: ArrayList<ModelClass>, val context:Context): RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){

       val image:ImageView = view.findViewById(R.id.image)
        val name:TextView = view.findViewById(R.id.name)
        val cardView = view.findViewById<CardView>(R.id.cardview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_file,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val module:ModelClass = dataList[position]

        holder.image.setImageResource(module.image)
        holder.name.setText(module.name)
        holder.cardView.setOnClickListener{
            Toast.makeText(context,"${module.name}", Toast.LENGTH_SHORT).show()
        }

    }
}