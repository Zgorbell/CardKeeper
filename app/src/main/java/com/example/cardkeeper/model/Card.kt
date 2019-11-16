package com.example.cardkeeper.model

import android.widget.ImageView
import com.example.entity.Card
import com.squareup.picasso.Picasso
import androidx.databinding.BindingAdapter



class Card(private val card: Card) {

    fun getPrice(): String{
        val currency = if(card.currency == "USD") "$" else "Non $"
        return currency + card.price.toString()
    }

    fun getCountCoins(): String{
        return card.countCoins.toString()
    }

    fun getDescription(): String{
        return card.description ?: "No description"
    }

    fun getImageUrl(): String{
        return card.image ?: ""
    }

    companion object{
        @JvmStatic
        @BindingAdapter("app:url")
        fun loadImage(view: ImageView, url: String) {
            Picasso.get().load(url).fit().into(view)
        }
    }
}