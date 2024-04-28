package com.example.examfood

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val longDesc = intent.getStringExtra("longdescription")
        val imageResId = intent.getIntExtra("image", 0)


        val nameTextViewHeader: TextView = findViewById(R.id.foodNameHeader)
        val nameTextView: TextView = findViewById(R.id.foodNameTxt)
        val descriptionTextView: TextView = findViewById(R.id.categoryTxt)
        val longDescriptionTextView: TextView = findViewById(R.id.longDes)
        val imageView: ImageView = findViewById(R.id.foodImg)

        val arrowImg: ImageView = findViewById(R.id.backBtn)
        arrowImg.setColorFilter(Color.WHITE)

        arrowImg.setOnClickListener {
            finish()
        }

        nameTextViewHeader.text = name
        nameTextView.text = name
        descriptionTextView.text = description
        longDescriptionTextView.text = longDesc
        imageView.setImageResource(imageResId)
    }
}