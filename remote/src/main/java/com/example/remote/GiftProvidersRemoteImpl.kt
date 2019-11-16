package com.example.remote

import com.example.entity.GiftProviders
import com.example.repository.GiftProvidersRemote
import com.google.gson.Gson
import com.sun.tracing.ProviderFactory
import java.io.*

class GiftProvidersRemoteImpl(private val providersFactory: ProvidersFactory): GiftProvidersRemote {

    override fun getProviders(): GiftProviders {
        val gson = Gson()
        val providers = gson.fromJson(providersFactory.getProvidersInputStreamReader(),
            com.example.remote.model.GiftProviders::class.java)
        return providers.toDomain()
    }
}