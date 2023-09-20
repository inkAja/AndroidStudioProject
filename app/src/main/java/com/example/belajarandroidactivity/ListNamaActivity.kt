package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
//        Devine array adapter
        val arrayAdapter:ArrayAdapter<*>
        val user = arrayOf(
            "Fateeh","Dzaki","Galih","Ndeva",
            "teehFa"
        )
        // deklarasikan ulang
        val mListview:ListView = findViewById(R.id.lvNama)
        //panggil object arrayadapter(this,layout_sample,data
        arrayAdapter = ArrayAdapter(this,
                                    android.R.layout.simple_list_item_1,user)
        // isi adapternya
        mListview.adapter = arrayAdapter
    }
}