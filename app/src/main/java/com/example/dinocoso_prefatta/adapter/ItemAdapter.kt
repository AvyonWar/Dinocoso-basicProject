package com.example.dinocoso_prefatta.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dinocoso_prefatta.R
import com.example.dinocoso_prefatta.SevenFragment
import com.example.dinocoso_prefatta.model.ImageTextView

class ItemAdapter(private val context: SevenFragment, private val dataset: List<ImageTextView>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_text)
        val imageView: ImageView = view.findViewById(R.id.item_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.textResourse)
        holder.imageView.setImageResource(item.imageResourse)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}