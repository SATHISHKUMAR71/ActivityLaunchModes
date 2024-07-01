package com.example.activitylaunchmodes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        findViewById<Button>(R.id.button3).setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
            }
        }
        findViewById<Button>(R.id.button4).setOnClickListener{
            Intent(this,ThirdActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}