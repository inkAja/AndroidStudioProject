package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
    //panggil handler() Dari Package OS
    // Postdelayed =menjalankan ketika delay beberapa detik
        Handler().postDelayed({
            val intent = Intent(this,BelajarNgajiActivity::class.java)
            startActivity(intent)

            finish()
        }, 3000)
    }
}