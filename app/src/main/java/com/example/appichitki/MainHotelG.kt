package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainHotelG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_hotel_g)
        val btnImpliciGran = findViewById<Button>(R.id.btnImplicit2)

        btnImpliciGran.setOnClickListener { gotoGran() }

    }

    fun gotoGran(){
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://es-la.facebook.com/hotel1enuribia/"))
        startActivity(implicitIntent)

    }
}