package com.example.appichitki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnSecond = findViewById<Button>(R.id.btnActividadTres)
        val imaguri = findViewById<ImageView>(R.id.imagurib)

        btnSecond.setOnClickListener { goToSecondActivity() }
        imaguri.setOnClickListener { iraUribia() }


    }

    fun iraUribia() {
        val secondIntent = Intent(this,MainJuyasirain::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Bienvenido al Hotel Juyasirain!!!", Toast.LENGTH_LONG).show()
    }

    fun goToSecondActivity() {
        val secondIntent = Intent(this,MainActivity3::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Hoteles de Uribia!!!", Toast.LENGTH_LONG).show()
    }
}