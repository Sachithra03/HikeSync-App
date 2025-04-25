package com.example.hikesyncapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile) // Use your correct layout name here

        val exploreIcon = findViewById<ImageView>(R.id.imageView42)
        val communityIcon = findViewById<ImageView>(R.id.imageView43)
        val favoritesIcon = findViewById<ImageView>(R.id.imageView45)

        exploreIcon.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        communityIcon.setOnClickListener {
            startActivity(Intent(this, CommunityActivity::class.java))
        }

        favoritesIcon.setOnClickListener {
            startActivity(Intent(this, FavoritesActivity::class.java))
        }

        // Optional: If you want to prevent opening ProfileActivity again
        // when clicking the profile icon, just skip it.
    }
}