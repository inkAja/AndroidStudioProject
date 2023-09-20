package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        val arrayAdapter: ArrayAdapter<*>
        val bahasa = arrayOf("Html","JavaScript","Python","C++","Java","Ruby",
                            "C#","SQL Server","MongoDB","PostgreSQL","Go","Lang")
        val mListView: ListView = findViewById(R.id.rvbahasa)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,bahasa)

        mListView.adapter = arrayAdapter
    }
}