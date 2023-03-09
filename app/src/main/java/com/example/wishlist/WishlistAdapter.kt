package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishlistAdapter(private val wishlist: List<Wishlist>) : RecyclerView.Adapter<WishlistAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameTextView: TextView
        val priceTextView: TextView
        val urlTextView: TextView

        init {
            nameTextView = itemView.findViewById(R.id.wishlist_name)
            priceTextView = itemView.findViewById(R.id.wishlist_price)
            urlTextView = itemView.findViewById(R.id.wishlist_url)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.wishlist_item, parent, false)
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return wishlist.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = wishlist.get(position)
        holder.nameTextView.text = item.name
        holder.priceTextView.text = item.price
        holder.urlTextView.text = item.url
    }
}