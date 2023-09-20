package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val tvText:TextView = findViewById(R.id.tvText)
        val btnClick:Button = findViewById(R.id.btnClick)

        btnClick.setOnClickListener{
            if (tvText.visibility== View.VISIBLE){
                tvText.visibility = View.INVISIBLE
            } else{
                tvText.visibility = View.VISIBLE
            }
        }
    }
}