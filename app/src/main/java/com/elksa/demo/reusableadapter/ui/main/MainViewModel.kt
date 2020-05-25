package com.elksa.demo.reusableadapter.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val data = MutableLiveData(
        listOf(
            ItemMainHeader("Demo title 1"),
            ItemMainBody("1", "Demo description 1", "db", "78"),
            ItemMainBody("2", "Demo description 2", "MB", "100"),
            ItemMainBody("3", "Demo description 3", "Km", "1"),
            ItemMainHeader("Demo title 2"),
            ItemMainBody("4", "Demo description 4", "Kg", "5"),
            ItemMainBody("5", "Demo description 5", "db", "23")
        )
    )
}
