package com.example.repository

import com.example.entity.GiftProviders

interface GiftProvidersRemote {

    fun getProviders(): GiftProviders
}