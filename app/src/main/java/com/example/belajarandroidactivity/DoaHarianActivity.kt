package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian:RecyclerView = findViewById(R.id.rvDoaHarian)
        val DoaHarian= arrayListOf<DoaHarian>(
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ",
                    "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Masuk Kamar Mandi Atau Toilet", "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِtُ",
                "Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi"),
            DoaHarian("Doa Keluar Kamar Mandi Atau Toilet", "غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ",
                "Ghufraanaka. Alhamdulillaahil ladzii adzhaba ‘annjil adzaa wa’aafaanii"),
            DoaHarian("Doa Sebelum Tidur", "بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُْ",
                "Bismikallohumma ahya wa amuutu")
        )
        val adapter = DoaHarianAdapter(DoaHarian)
        val linearHorizontal = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager = linearHorizontal
    }
}