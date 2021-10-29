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
        val implicitIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:+573002353263"))
        //implicitIntent.putExtra("sms_body","Mi mensaje")
        startActivity(implicitIntent)
    }
}