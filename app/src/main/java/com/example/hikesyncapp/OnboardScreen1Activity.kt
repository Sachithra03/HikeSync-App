package com.example.hikesyncapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardScreen1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboradscreen1) // make sure it's spelled correctly

        val nextButton = findViewById<Button>(R.id.button)
        nextButton.setOnClickListener {
            startActivity(Intent(this, OnboardScreen2Activity::class.java))
        }
    }
}