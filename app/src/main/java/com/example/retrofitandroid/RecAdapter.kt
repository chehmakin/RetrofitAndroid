package com.example.retrofitandroid

import android.content.Context

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofitandroid.databinding.ItemBinding


class RecAdapter(private val list: List<Model?>, private val context: Context) :
    RecyclerView.Adapter<RecAdapter.FishVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FishVH {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater)
        return FishVH(binding)
    }

    override fun onBindViewHolder(holder: FishVH, pos: Int) {
        holder.textView3.text = list.get(pos)?.location ?: ""
        holder.textView4.text = list.get(pos)?.habitat  ?: ""
        holder.textView1.text = (list.get(pos)?.speciesName)
        holder.textView2.text = (list.get(pos)?.scientificName)
        holder.textViewTitle.text = (list.get(pos)?.imageGallery?.title)
        Glide.with(context)
            .load(list.get(pos)?.imageGallery?.src)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class FishVH(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val textView1 = binding.tv1
        val textView2 = binding.tv2
        val textView3 = binding.tv3
        val textView4 = binding.tv4
        val textViewTitle = binding.tvTitle
        val imageView = binding.image
    }
}