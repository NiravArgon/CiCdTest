package com.example.cicdtest

import android.graphics.Color
import androidx.core.content.ContextCompat
import com.example.cicdtest.databinding.ActivityMainBinding


class MainActivity : ActBase<ActivityMainBinding>() {

    override fun setViewBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun bindObjects() {
        
    }

    override fun bindListeners() {
        binding.tabLayout.item1.setOnClickListener {
            binding.tabLayout.select.animate().x(0f).duration = 100
            binding.tabLayout.item1.setTextColor(Color.WHITE)
            binding.tabLayout.item2.setTextColor(ContextCompat.getColor(this,R.color.appColor))
        }

        binding.tabLayout.item2.setOnClickListener {
            binding.tabLayout.item1.setTextColor(ContextCompat.getColor(this,R.color.appColor))
            binding.tabLayout.item2.setTextColor(Color.WHITE)
            val size:Float = binding.tabLayout.item2.width.toFloat()
            binding.tabLayout.select.animate().x(size).duration = 100
        }
    }

    override fun bindMethods() {
        
    }
}