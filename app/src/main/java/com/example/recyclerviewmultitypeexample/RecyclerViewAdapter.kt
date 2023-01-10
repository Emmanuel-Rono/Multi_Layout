package com.example.recyclerviewmultitypeexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val context: Context, val list: ArrayList<Data>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_ONE = 1
        const val VIEW_TYPE_TWO = 2
    }

    class View1ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val message: TextView = itemView.findViewById(R.id.textView)
       //
    }

    class View2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var message2: TextView = itemView.findViewById(R.id.textView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if
                (viewType == VIEW_TYPE_ONE) {
            return View1ViewHolder(
                LayoutInflater.from(context).inflate(R.layout.item_view_1, parent, false)
            )
        } else {
            //   return View2ViewHolder(
            val view = LayoutInflater.from(context).inflate(R.layout.item_view_2, parent, false)
            return View2ViewHolder(view)
            //)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder:RecyclerView.ViewHolder, position: Int) {

        val data = list[position]






    }
    //var list: ArrayList<Data> = list


    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }
}