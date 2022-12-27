package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloButton = findViewById<Button>(R.id.helloButton)
        helloButton.setOnClickListener {
            Log.v("helloWorld", "button clicked!")
            Toast.makeText(this, getString(R.string.toastMessage), Toast.LENGTH_SHORT).show()
        }
    }
}