package com.example.cicdtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class ActBase<actBinding : ViewBinding> : AppCompatActivity() {

    lateinit var binding: actBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setViewBinding()
        setContentView(binding.root)
        bindObjects()
        bindListeners()
        bindMethods()
    }

    abstract fun setViewBinding(): actBinding
    abstract fun bindObjects()
    abstract fun bindListeners()
    abstract fun bindMethods()

}