package com.example.hikesyncapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardScreen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboradscreen2) // ✅ fixed layout name

        val nextButton = findViewById<Button>(R.id.button2)
        nextButton.setOnClickListener {
            startActivity(Intent(this, OnboardScreen3Activity::class.java))
        }
    }
}