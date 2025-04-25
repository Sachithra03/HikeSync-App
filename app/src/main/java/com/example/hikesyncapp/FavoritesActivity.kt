package com.example.hikesyncapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FavoritesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites_page)

        val exploreIcon = findViewById<ImageView>(R.id.imageView31)
        exploreIcon.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        val communityIcon = findViewById<ImageView>(R.id.imageView32)
        communityIcon.setOnClickListener {
            startActivity(Intent(this, CommunityActivity::class.java))
        }

        val profileIcon = findViewById<ImageView>(R.id.imageView35)
        profileIcon.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}