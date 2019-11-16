package com.example.repository.remote

import com.example.entity.GiftProvidersRepository
import com.example.entity.GiftProviders
import com.example.repository.GiftProvidersRemote

class GiftProvidersRepositoryImpl(
    private val giftProvidersRemote: GiftProvidersRemote
) : GiftProvidersRepository {

    override fun getGiftProviders(): GiftProviders {
        return giftProvidersRemote.getProviders()
    }
}