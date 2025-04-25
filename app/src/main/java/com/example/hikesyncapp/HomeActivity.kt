package com.example.hikesyncapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val trailsImage = findViewById<ImageView>(R.id.imageView17)
        val favoritesIcon = findViewById<ImageView>(R.id.imageView29)
        val profileIcon = findViewById<ImageView>(R.id.imageView30)
        val communityIcon = findViewById<ImageView>(R.id.imageView27)

        trailsImage.setOnClickListener {
            val intent = Intent(this, DescriptionActivity::class.java)
            startActivity(intent)
        }

        favoritesIcon.setOnClickListener {
            val intent = Intent(this, FavoritesActivity::class.java)
            startActivity(intent)
        }

        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java) // ✅ navigate to profile
            startActivity(intent)
        }
        communityIcon.setOnClickListener {
            val intent = Intent(this, CommunityActivity::class.java)
            startActivity(intent)
        }
    }
}