package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.Doa

class BelajarNgajiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_ngaji)
        val rvListDoa: RecyclerView = findViewById(R.id.rvListDoa)
        val ListDoa = arrayListOf<Doa>(
            Doa("Dzikir & Doa Sunnah setelah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
            Doa("Dzikir & Doa Sunnah setelah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Setiap Saat",R.drawable.doa_harian2),
            Doa("Dzikir Pagi Dan Petang",R.drawable.doa_harian2)
        )
        val adapter = DoaAdapter(ListDoa)
        val linearVertical = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        rvListDoa.adapter = adapter
        rvListDoa.layoutManager = linearVertical

        val btnKeDoa:Button = findViewById(R.id.btnKeDoa)

        btnKeDoa.setOnClickListener{
            val intent = Intent(this, DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
}