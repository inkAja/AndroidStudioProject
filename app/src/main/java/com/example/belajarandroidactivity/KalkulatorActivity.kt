package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class KalkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        val angkaSatu:EditText = findViewById(R.id.inputAngka1)
        val angkaDua:EditText = findViewById(R.id.inputAngka2)

        val btnTambah:Button = findViewById(R.id.btnTambah)
        val btnKurang:Button = findViewById(R.id.btnKurang)
        val btnModulus:Button = findViewById(R.id.btnModulus)
        val btnKali:Button = findViewById(R.id.btnKali)
        val btnBagi:Button = findViewById(R.id.btnBagi)
        val btnClear:Button = findViewById(R.id.btnClear)

        val hasil:TextView = findViewById(R.id.hasilHitung)
        val builder:AlertDialog.Builder = AlertDialog.Builder(this@KalkulatorActivity)

        btnTambah.setOnClickListener{
            val Hitung:Int = angkaSatu.text.toString().toInt() + angkaDua.text.toString().toInt()

            hasil.text = Hitung.toString()
        }
        btnKurang.setOnClickListener{
            val Hitung:Int = angkaSatu.text.toString().toInt() - angkaDua.text.toString().toInt()

            hasil.text = Hitung.toString()
        }
         btnModulus.setOnClickListener{
            val Hitung:Int = angkaSatu.text.toString().toInt() % angkaDua.text.toString().toInt()

            hasil.text = Hitung.toString()
        }
        btnKali.setOnClickListener{
            val Hitung:Int = angkaSatu.text.toString().toInt() * angkaDua.text.toString().toInt()

            hasil.text = Hitung.toString()
        }
        btnBagi.setOnClickListener{
            val Hitung:Int = angkaSatu.text.toString().toInt() / angkaDua.text.toString().toInt()

            hasil.text = Hitung.toString()
        }
        btnClear.setOnClickListener{

            builder.setTitle("Perhatian!!")
            builder.setMessage("Kamu yakin mau menghapus datanya?")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                var Hitung:Int = hasil.text.toString().toInt()
                Hitung = 0
                angkaSatu.setText("")
                angkaDua.setText("")
                hasil.text = Hitung.toString()
            })
            builder.setNegativeButton("NO",DialogInterface.OnClickListener { dialog, which -> })
            builder.setIcon(R.drawable.icon)
            // agar alertnya muncul buat variabel ini
            val alertDialog:AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}