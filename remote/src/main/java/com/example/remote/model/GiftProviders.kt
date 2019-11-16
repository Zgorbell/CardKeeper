package com.example.remote.model

import Provider
import com.example.entity.GiftProviders
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GiftProviders {

    @SerializedName("providers")
    @Expose
    var providers: List<Provider>? = null

    fun toDomain(): GiftProviders{
        val newProviders = providers?.map { it.toDomain() } ?: ArrayList()
        return GiftProviders(newProviders)
    }
}
