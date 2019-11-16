package com.example.cardkeeper.di

import com.example.cardkeeper.ProvidersFactoryImpl
import com.example.cardkeeper.shared.SharedGiftCard
import com.example.cardkeeper.ui.cards.CardsViewModel
import com.example.entity.GiftProvidersRepository
import com.example.remote.GiftProvidersRemoteImpl
import com.example.repository.GiftProvidersRemote
import com.example.repository.remote.GiftProvidersRepositoryImpl
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileReader
import java.io.InputStreamReader


val viewModelModule = module {
    viewModel { CardsViewModel(get()) }
}

val repositoryModule = module {
    factory { GiftProvidersRepositoryImpl(get()) as GiftProvidersRepository }
}

val remoteModule = module {
    factory {

        GiftProvidersRemoteImpl(ProvidersFactoryImpl(androidContext())
        ) as GiftProvidersRemote

    }
}

val sharedModule = module{
    single {
        SharedGiftCard()
    }
}