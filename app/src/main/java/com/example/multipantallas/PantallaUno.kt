package com.example.multipantallas

import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.content.Intent as Intent1
import android.os.Bundle as Bundle1

class PantallaUno : AppCompatActivity() {

    var salida: TextView? = null
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_uno)
        salida = findViewById<TextView>(R.id.textView4)

            

    }
}
