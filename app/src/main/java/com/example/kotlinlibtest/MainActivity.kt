package com.example.kotlinlibtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibraryextensions.toastLongCustom

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = "My First Library"

        name.toastLongCustom()
    }

}
