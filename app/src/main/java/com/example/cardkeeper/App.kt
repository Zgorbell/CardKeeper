package com.example.cardkeeper

import android.app.Application
import com.example.cardkeeper.di.remoteModule
import com.example.cardkeeper.di.repositoryModule
import com.example.cardkeeper.di.sharedModule
import com.example.cardkeeper.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Android context
            androidContext(this@App)
            // modules
            modules(viewModelModule)
            modules(repositoryModule)
            modules(remoteModule)
            modules(sharedModule)
        }
    }
}