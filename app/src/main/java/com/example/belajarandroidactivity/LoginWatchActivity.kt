package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginWatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_watch)

        val etusername:EditText = findViewById(R.id.etUsername)
        val etpassword:EditText = findViewById(R.id.etPassword)
        val btnLogin:Button = findViewById(R.id.btnLogin)
        val tvSalah:TextView = findViewById(R.id.tvSalah)

        val username = "Fateeh"
        val pass = "Tehfa"

        btnLogin.setOnClickListener{
            if (etusername.text.toString() == username && etpassword.text.toString() == pass){
                Toast.makeText(this, "Kamu berhasil login", Toast.LENGTH_SHORT).show()
                tvSalah.visibility = View.INVISIBLE
            } else{
                tvSalah.visibility = View.VISIBLE
            }
        }
    }
}