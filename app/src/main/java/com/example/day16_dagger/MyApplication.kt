package com.example.day16_dagger

import android.app.Application

class MyApplication : Application() {
//    val appContainer: AppContainer = AppContainer()

    //DaggerApplicationComponent auto generate
    val applicationComponent = DaggerApplicationComponent.create()

}