package com.example.examfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startBtn: Button = findViewById(R.id.sartBtn)
        startBtn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
//        Handler(Looper.getMainLooper()).postDelayed({startActivity(Intent(this, HomeActivity::class.java))},2000)
    }
}