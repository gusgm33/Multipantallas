package com.example.multipantallas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var entrada: EditText? = null
    var entrada2: EditText? = null
    var entrada3: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        entrada = findViewById<EditText>(R.id.editText)
        entrada2 = findViewById<EditText>(R.id.editText2)
        entrada3 = findViewById<EditText>(R.id.editText3)
    }

    fun lanzarPantalla(view:View){

        val lanzador = Intent(this,PantallaUno::class.java)
        lanzador.putExtra("lanzar", entrada.toString())
        startActivity(lanzador)

    }
    fun lanzarPantalla2(view:View){

        val lanzador2 = Intent(this,PantallaDos::class.java)
        lanzador2.putExtra("lanzar2" , entrada2.toString())
        startActivity(lanzador2)

    }
    fun lanzarPantalla3(view:View){

        val lanzador3 = Intent(this,PantallaTres::class.java)
        lanzador3.putExtra("lanzar3" , entrada3.toString())
        startActivity(lanzador3)

    }



}
