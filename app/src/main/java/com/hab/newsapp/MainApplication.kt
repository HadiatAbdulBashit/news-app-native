package com.hab.newsapp

import android.app.Application
import com.hab.newsapp.di.apiModule
import com.hab.newsapp.di.repositoryModule
import com.hab.newsapp.di.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                listOf(
                    apiModule,
                    vmModule,
                    repositoryModule
                )
            )
        }
    }
}