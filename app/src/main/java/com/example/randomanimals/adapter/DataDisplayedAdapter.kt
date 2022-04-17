package com.example.randomanimals.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.randomanimals.R

class DataDisplayedAdapter: RecyclerView.Adapter<DataDisplayedAdapter.DataDisplayedViewHolder>() {


    private val list = ('A').rangeTo('Z').toList()

    class DataDisplayedViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var charButton: Button = view.findViewById(R.id.button)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataDisplayedViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.intent_data_adapter_item, parent, false)
        return DataDisplayedViewHolder(layout)
    }

    override fun onBindViewHolder(holder: DataDisplayedViewHolder, position: Int) {
        val item = list.get(position)
        holder.charButton.text = item.toString()

    }

}

