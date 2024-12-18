package com.devatri.dependencyinjection

import android.app.Application
import com.devatri.dependencyinjection.di.app2Module
import com.devatri.dependencyinjection.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(app2Module)
        }
    }
}