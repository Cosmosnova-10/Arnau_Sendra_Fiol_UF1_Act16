package com.example.uf1act16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val btn: Button = findViewById(R.id.button4)
        btn.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

    }
}