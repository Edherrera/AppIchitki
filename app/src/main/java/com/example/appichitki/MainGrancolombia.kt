package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainGrancolombia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_grancolombia)

        val btnSecond = findViewById<Button>(R.id.btnActividadUribia)
        val imageGran = findViewById<ImageView>(R.id.imagGran )


        btnSecond.setOnClickListener { goToSecondActivity() }
        imageGran.setOnClickListener { irgran() }


    }

    fun irgran() {
        val secondIntent = Intent(this,MainHotelG::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Bienvenido al Hotel Uribia!!!", Toast.LENGTH_LONG).show()
    }

    fun goToSecondActivity() {
        val secondIntent = Intent(this,MainHotelUribia::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Seleccionaste Hotel Uribia!!!", Toast.LENGTH_LONG).show()
    }
}