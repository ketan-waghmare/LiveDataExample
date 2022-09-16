package com.game.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val factsLiveData = MutableLiveData<String>("This is a fact")

    fun updateLiveData() {
        factsLiveData.value = "Another Fact after update"
    }
}