package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b = findViewById<Button>(R.id.petButton)
        b.setOnClickListener(
            View.OnClickListener {
                Log.v("hello world", "meow, you're awesome :)")
                Toast.makeText(this,"meow, you're awesome :)", Toast.LENGTH_LONG).show()
            }
        )
    }
}

