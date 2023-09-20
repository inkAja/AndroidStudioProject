package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.belajarandroidactivity.R.id.ivBackgroundOP
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity() {
    var ivBackground:ImageView? =null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)
        ivBackground= findViewById(R.id.ivBackgroundOP)

        Glide.with(this)
            .load(R.drawable.bg_onepiece)
            .transform(BlurTransformation(25, 3))
            .into(ivBackground!!)
    }
}