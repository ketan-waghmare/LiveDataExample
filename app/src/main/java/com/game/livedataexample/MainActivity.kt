package com.game.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    private val factTextView : TextView
    get() = findViewById(R.id.textview_main)

    private val btnUpdate : Button
    get() = findViewById(R.id.btn_update)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.factsLiveData.observe(this, Observer {
            factTextView.text = it
        })

        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()
        }
    }
}