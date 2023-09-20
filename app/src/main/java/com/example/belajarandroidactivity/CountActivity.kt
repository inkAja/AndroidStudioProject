package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.core.util.rangeTo
import kotlin.math.log

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val angkaCount: TextView = findViewById(R.id.angkaCount)
        val btnCount: Button = findViewById(R.id.btnCount)
        val btnMinus:Button = findViewById(R.id.btnMinus)
        val btnReset:Button = findViewById(R.id.btnReset)
        // panggil fungsi
        //setText dan getText
        // setText = mengirim/merubah data
        angkaCount.text = "0"
        // getText = mengambil text
        println(angkaCount.text)
        // debug
        Log.d("count", "Angkanya menjadi: ${angkaCount.text}")

        btnCount.setOnClickListener {
            var tambah:Int = angkaCount.text.toString().toInt()
            tambah ++
            angkaCount.text = tambah.toString()
        }
        btnMinus.setOnClickListener{
            var kurang:Int = angkaCount.text.toString().toInt()
            kurang --
            angkaCount.text = kurang.toString()
        }
        btnReset.setOnClickListener{
            var reset:Int = angkaCount.text.toString().toInt()
            reset = 0
            angkaCount.text = reset.toString()
        }
    }
}
