package com.example.cardkeeper.model

import com.example.entity.GiftProviders

class GiftProvidersUI(private val providers: GiftProviders) {

    private val giftProviders =
        providers.providers.map { GiftProviderUI(it) }

    fun getProviders(): List<GiftProviderUI>{
        return giftProviders
    }
}