package com.example.randomanimals.adapter


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.randomanimals.MainActivity
import com.example.randomanimals.R
import com.example.randomanimals.databinding.AdapterItemViewBinding
import com.example.randomanimals.recylerview.RvActivity

class CharListAdapter : RecyclerView.Adapter<CharListAdapter.CharViewHolder>() {



    private val list = ('A').rangeTo('Z').toList()

    class CharViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var charButton: Button = view.findViewById(R.id.button_item)


    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharViewHolder {

        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.adapter_item_view, parent, false)
            return CharViewHolder(layout)
    }

    override fun onBindViewHolder(holder: CharViewHolder, position: Int) {
        val item = list.get(position)
        holder.charButton.text = item.toString()

        val context =  holder.charButton.context

        holder.charButton.setOnClickListener {

            Intent(context, RvActivity::class.java).also {
                context.startActivity(it)
            }
        }

        }

    }
