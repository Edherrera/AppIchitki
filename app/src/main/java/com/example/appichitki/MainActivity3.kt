package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val btnSecond = findViewById<Button>(R.id.btnActividadIchi)
        val imageichi = findViewById<ImageView>(R.id.imageIchitki)


        btnSecond.setOnClickListener { goToSecondActivity() }
        imageichi.setOnClickListener { irichitki() }


    }

    fun irichitki() {
        val secondIntent = Intent(this,MainIchitki::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Bienvenido al Hotel Ichitki!!!", Toast.LENGTH_LONG).show()
    }

    fun goToSecondActivity() {
        val secondIntent = Intent(this,MainGrancolombia::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Hoteles de Uribia!!!", Toast.LENGTH_LONG).show()
    }
}