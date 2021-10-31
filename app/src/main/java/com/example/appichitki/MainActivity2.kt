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
        val btnSecond2 = findViewById<Button>(R.id.btnActividadgaleria)
        val imagejuya = findViewById<ImageView>(R.id.imagjuya)


        btnSecond.setOnClickListener { goToSecondActivity() }
        btnSecond2.setOnClickListener { goToSecondActivity2() }
        imagejuya.setOnClickListener { irjuya() }


    }

    fun irjuya() {
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

    fun goToSecondActivity2() {
        val secondIntent = Intent(this,MainUribia::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, "Hoteles de Uribia!!!", Toast.LENGTH_LONG).show()
    }

}