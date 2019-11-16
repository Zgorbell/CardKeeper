package com.example.remote.model

import com.example.entity.Card
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GiftCard {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("featured")
    @Expose
    var featured: Boolean? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("credits")
    @Expose
    var credits: Int? = null
    @SerializedName("image_url")
    @Expose
    var imageUrl: String? = null
    @SerializedName("codes_count")
    @Expose
    var codesCount: Double? = null
    @SerializedName("currency")
    @Expose
    var currency: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("redeem_url")
    @Expose
    var redeemUrl: String? = null

    fun toDomain(): Card{
        return Card(codesCount ?: 0.0,
            credits ?: 0,
            currency ?: "",
            description,
            imageUrl ,
            0)
    }
}