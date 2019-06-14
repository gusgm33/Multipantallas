package com.example.multipantallas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PantallaTres : AppCompatActivity() {

    var salida3: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_tres)
        salida3 = findViewById<TextView>(R.id.textView8)
    }
}
