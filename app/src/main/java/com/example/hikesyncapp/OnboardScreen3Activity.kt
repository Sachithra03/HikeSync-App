package com.example.hikesyncapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardScreen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboradscreen3) // create this layout

        val nextButton = findViewById<Button>(R.id.button3)
        nextButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}