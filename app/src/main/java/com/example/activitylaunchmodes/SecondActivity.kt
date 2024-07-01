package com.example.activitylaunchmodes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.loader.app.LoaderManager

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        findViewById<Button>(R.id.button2).setOnClickListener{
            val intent = Intent(this,ThirdActivity::class.java).also {
                it.addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)
                it.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
                startActivity(it)
            }
//            intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
//            startActivity(intent)
        }
        findViewById<Button>(R.id.button3).setOnClickListener{
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}