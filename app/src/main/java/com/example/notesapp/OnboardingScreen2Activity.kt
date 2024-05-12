package com.example.notesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_2)

        // Assuming the button ID is btnNext2
        val btnNext2 = findViewById<Button>(R.id.btnNext2)
        btnNext2.setOnClickListener {
            // Launch OnboardingScreen3Activity
            startActivity(Intent(this, OnboardingScreen3Activity::class.java))
            finish() // Finish this activity to prevent back navigation
        }
    }
}