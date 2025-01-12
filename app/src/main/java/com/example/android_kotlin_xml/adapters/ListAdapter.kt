package com.example.android_kotlin_xml.adapters

import ItemsList
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_kotlin_xml.R


class ListAdapter(private val items: List<ItemsList>) :
    RecyclerView.Adapter<ListAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.itemTextView)
        val imageView: ImageView = itemView.findViewById(R.id.itemImageView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemName = items[position]
        holder.textView.text = itemName.title
        holder.imageView.setImageResource(itemName.imageResId)
    }
}
