package com.example.hikesyncapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val continueWithEmail = findViewById<TextView>(R.id.textView4)
        val appleLogo = findViewById<ImageView>(R.id.imageView10)
        val fbLogo = findViewById<ImageView>(R.id.imageView11)

        val intent = Intent(this, OnboardScreen1Activity::class.java)

        continueWithEmail.setOnClickListener { startActivity(intent) }
        appleLogo.setOnClickListener { startActivity(intent) }
        fbLogo.setOnClickListener { startActivity(intent) }
    }
}