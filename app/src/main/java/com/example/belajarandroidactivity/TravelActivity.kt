package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
//  ? = boleh kosong
// deklarasi variabel
    var ibCall:ImageButton?=null
    var ibNavigate:ImageButton?=null
    var ibShare:ImageButton?=null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)
// !! =
        ibCall!!.setOnClickListener{
//          parameter intent untuk telephone = Intent.ACTION.DIAL
            val phoneNumber ="0251123122"
// Uri.parse untuk mengambil nomor
            val phoneIntent = Intent(Intent.ACTION_DIAL,Uri.parse("tel: $phoneNumber"))
            startActivity(phoneIntent)
        }

        ibNavigate!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo: -6.583132163894699, 106.76770358130005"))
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
    }
}