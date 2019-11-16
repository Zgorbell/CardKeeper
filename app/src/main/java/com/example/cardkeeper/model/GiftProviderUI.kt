package com.example.cardkeeper.model

import com.example.entity.GiftProvider

class GiftProviderUI(private val giftProvider: GiftProvider) {

    private val cards = giftProvider.cards.map { Card(it) }
    private val name = giftProvider.name

    fun getName(): String{
        return name ?: "Name not loaded"
    }

    fun getCards(): List<Card>{
        return cards
    }
}