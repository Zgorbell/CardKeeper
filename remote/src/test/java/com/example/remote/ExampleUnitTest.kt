package com.example.remote

import com.example.repository.GiftProvidersRemote
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import java.io.BufferedReader
import java.io.FileReader

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var giftProvidersRemote: GiftProvidersRemote

    @Before
    fun before(){
        giftProvidersRemote = GiftProvidersRemoteImpl(BufferedReader(FileReader("providers")))
    }

    @Test
    fun addition_isCorrect() {
        val providers = giftProvidersRemote.getProviders()
        assertTrue(providers.providers.isNotEmpty())
    }
}
