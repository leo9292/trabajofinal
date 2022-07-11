package com.example.cvapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val boton = findViewById<androidx.cardview.widget.CardView>(R.id.blackground_card)
        boton.setOnClickListener {
        var intento = Intent(this, background::class.java)
            startActivity(intento)

    }
  }
}