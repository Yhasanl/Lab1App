package com.example.lab1app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val MyTextView = findViewById<TextView>(R.id.MyTextView)
        val ChangeTextButton = findViewById<Button>(R.id.ChangeTextButton)

        // Set click listener for the button
        ChangeTextButton.setOnClickListener {
            // Change the text when button is clicked
            MyTextView.text = "Text has been changed!"
        }
        val ChangeColorButton = findViewById<Button>(R.id.ChangeColorButton)

        // Set click listener for the second button
        ChangeColorButton.setOnClickListener {
            // Change the text color to RED when clicked
            MyTextView.setTextColor(android.graphics.Color.RED)
        }
    }
}