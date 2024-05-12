package com.example.notesapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class OnboardingScreen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_3)

        // Assuming the button ID is btnFinish
        val btnFinish = findViewById<Button>(R.id.btnFinish)
        btnFinish.setOnClickListener {
            // Start the main activity
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Finish this activity to prevent back navigation
        }
    }
}