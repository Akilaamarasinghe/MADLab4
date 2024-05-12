package com.example.notesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.notesapp.databinding.OnboardingScreen1Binding

class OnboardingScreen1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_1)

        // Assuming the button ID is btnNext1
        val btnNext1 = findViewById<Button>(R.id.btnNext1)
        btnNext1.setOnClickListener {
            // Launch OnboardingScreen2Activity
            startActivity(Intent(this, OnboardingScreen2Activity::class.java))
            finish() // Finish this activity to prevent back navigation
        }
    }
}