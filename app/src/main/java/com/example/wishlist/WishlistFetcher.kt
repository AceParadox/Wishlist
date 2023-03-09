package com.example.wishlist

import android.widget.TextView

class WishlistFetcher {
    companion object {
        val name = listOf("Shoes", "shirt", "pants", "socks")
        val price = "$0"
        val url = "url.com"

        fun getWishlist(): MutableList<Wishlist> {
            var wishlist: MutableList<Wishlist> = ArrayList()
            for (i in 0..3) {
                val item = Wishlist(name[i], price, url)
                wishlist.add(item)
            }
            return wishlist
        }
    }
}