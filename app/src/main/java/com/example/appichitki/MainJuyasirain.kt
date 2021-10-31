package com.example.appichitki

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainJuyasirain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_juyasirain)
        val btnImplicit = findViewById<Button>(R.id.btnImplicit)


        btnImplicit.setOnClickListener { goToOtherApp() }
    }



    fun goToOtherApp() {
        val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co/Hotel_Review-g2440191-d2701993-Reviews-Hotel_Juyasirain-Uribia_La_Guajira_Department"))
        //implicitIntent.putExtra("sms_body","Mi mensaje")
        startActivity(implicitIntent)
    }
}