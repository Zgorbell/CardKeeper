package com.example.cardkeeper

import android.content.Context
import com.example.remote.ProvidersFactory
import java.io.InputStreamReader

class ProvidersFactoryImpl(private val context: Context): ProvidersFactory {

    override fun getProvidersInputStreamReader(): InputStreamReader {
        return InputStreamReader(context.assets.open("providers"))
    }
}