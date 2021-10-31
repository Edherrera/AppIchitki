package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainHotelUribia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hotel_uribia)



        //val btnSecond = findViewById<Button>(R.id.btnActividadUribia)
        val imageUribia = findViewById<ImageView>(R.id.imagUribia )


        //btnSecond.setOnClickListener { goToSecondActivity() }
        imageUribia.setOnClickListener { irservicio() }


    }

    fun irservicio() {
        val secondIntent = Intent(this,MainServicioUribia::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Bienvenido al Hotel Uribia!!!", Toast.LENGTH_LONG).show()
    }
}