package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val judulForm:TextView = findViewById(R.id.judulForm)
        val labelNama:TextView = findViewById(R.id.labelNama)
        val labelKelas:TextView = findViewById(R.id.labelKelas)
        val labelKode:TextView = findViewById(R.id.labelKode)

        val inputNama:EditText = findViewById(R.id.inputNama)
        val inputKelas:EditText = findViewById(R.id.inputKelas)
        val inputKode:EditText = findViewById(R.id.inputKode)

        val btnSubmit:Button = findViewById(R.id.btnSubmit)

        val showNama:TextView = findViewById(R.id.showNama)
        val showKelas:TextView = findViewById(R.id.showKelas)
        val showKode:TextView = findViewById(R.id.showKode)

        btnSubmit.setOnClickListener{
            showNama.text = inputNama.text
            showKelas.text = inputKelas.text
            val kode:Int = inputKode.text.toString().toInt()

            showKode.text = when(kode){
                123 -> "Harrry Potter"
                456 -> "Alice in Wonderland"
                789 -> "Vinland Saga"
                404 -> "NOT FOUND"
                else -> "Gak ada"
            }

            Toast.makeText(this,"Kamu meminjam buku ${showKode.text} ", Toast.LENGTH_SHORT).show()
        }
    }
}