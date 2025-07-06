package com.example.testingapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val image = intent.getIntExtra("image",-1)
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")

        val tvName = findViewById<TextView>(R.id.tvName)
        val ivImage = findViewById<ImageView>(R.id.ivImageDetail)
        val tvDescription = findViewById<TextView>(R.id.tvDetailDescription)


        tvName.text = name
        ivImage.setImageResource(image)
        tvDescription.text = description

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}