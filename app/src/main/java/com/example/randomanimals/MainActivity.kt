package com.example.randomanimals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.randomanimals.adapter.CharListAdapter
import com.example.randomanimals.adapter.DataDisplayedAdapter
import com.example.randomanimals.databinding.ActivityMainBinding
import com.example.randomanimals.databinding.AdapterItemViewBinding
import com.example.randomanimals.recylerview.RvActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var xbinding: AdapterItemViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        xbinding = AdapterItemViewBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.veritcalRecyclerView.adapter = CharListAdapter()



        }

    }
