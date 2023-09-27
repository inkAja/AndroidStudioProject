package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val btnpindah:Button = findViewById(R.id.btnpindah)

        btnpindah.setOnClickListener{
            val intent = Intent(this,LoginWatchActivity::class.java)
            startActivity(intent)
        }
    }
}