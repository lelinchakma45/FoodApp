package com.example.examfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {

    val menuName = arrayOf<String>(
        "Profile Setting",
        "My Favorites",
        "Support",
        "Setting",
        "Logout"
    )

    val menuImage = arrayOf(
        R.drawable.account,
        R.drawable.love,
        R.drawable.support,
        R.drawable.gear,
        R.drawable.logout_twp
    )

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        listView = findViewById(R.id.profileList)

        val menuListAdapter = ProfileAdapter(this,menuName, menuImage)

        val backButton:ImageView = findViewById(R.id.backBtn)

        listView.adapter = menuListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "hjudw", Toast.LENGTH_SHORT).show()
        }
        backButton.setOnClickListener {
            finish()
        }
    }
}