package com.example.belajarandroidactivity.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Language

class LanguageAdapter(val data:ArrayList<Language>) :RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()
{
    class LanguageViewHolder(view:View) :
        RecyclerView.ViewHolder(view) {
        val tvBahasa:TextView = view.findViewById(R.id.tvBahasa)
        val ivLogo:ImageView = view.findViewById(R.id.ivlogo)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
    val view = LayoutInflater.from(parent.context)
        .inflate(R.layout.item_bahasa_pemrograman,parent,false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvBahasa.text = item.name
        holder.ivLogo.setImageResource(item.image)
    }
}