package com.example.remote

import java.io.InputStreamReader

interface ProvidersFactory {

    fun getProvidersInputStreamReader(): InputStreamReader
}