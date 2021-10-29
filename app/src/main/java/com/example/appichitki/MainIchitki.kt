package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainIchitki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ichitki)
        val btnImpliciIchitki = findViewById<Button>(R.id.btnImplicit1)

        btnImpliciIchitki.setOnClickListener { gotoIchitki() }

    }

    fun gotoIchitki(){
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelichitki.com/"))
        startActivity(implicitIntent)

    }
}