package com.example.randomanimals.recylerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.randomanimals.adapter.DataDisplayedAdapter
import com.example.randomanimals.databinding.RecyclerViewLayoutBinding

class RvActivity: AppCompatActivity() {

   private lateinit var binding: RecyclerViewLayoutBinding

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = RecyclerViewLayoutBinding.inflate(layoutInflater)
      setContentView(binding.root)

      binding.rvActivity.adapter = DataDisplayedAdapter()




   }
}