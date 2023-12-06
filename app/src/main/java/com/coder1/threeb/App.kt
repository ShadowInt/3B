package com.coder1.threeb

import android.app.Application

class App: Application() {
    val sharedPreferencesManager by lazy { SharedPreferencesManager(this) }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: App
            private set
    }
}