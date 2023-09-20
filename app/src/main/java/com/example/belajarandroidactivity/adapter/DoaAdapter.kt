package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Doa

class DoaAdapter(val data:ArrayList<Doa>): RecyclerView.Adapter<DoaAdapter.DoaViewHolder>(){
    class DoaViewHolder(view: View) :RecyclerView.ViewHolder(view){
        // deklarasi view yang mau kita gunakan pada card
        val ivLogo:ImageView = view.findViewById(R.id.ivLogo)
        val tvDoa:TextView = view.findViewById(R.id.tvDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
// terapkan layout item_doa pada recycler view
        val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_list_doa,parent,false)
        return DoaViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        // ambil data pada array language dengan mengambil berdasakan posisinya
        val item = data.get(position)
        holder.tvDoa.text = item.judulDoa
        holder.ivLogo.setImageResource(item.gambar) }
}