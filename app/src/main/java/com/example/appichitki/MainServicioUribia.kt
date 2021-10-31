package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainServicioUribia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_servicio_uribia)
        val btnImpliciGran = findViewById<Button>(R.id.btnImplicit3)

        btnImpliciGran.setOnClickListener { gotoUribia() }

    }

    fun gotoUribia(){
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co/Hotel_Review-g2440191-d12392330-Reviews-Hotel_Uribia-Uribia_La_Guajira_Department.html"))
        startActivity(implicitIntent)

    }
}