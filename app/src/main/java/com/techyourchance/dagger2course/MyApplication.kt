package com.techyourchance.dagger2course

import android.app.Application
import com.techyourchance.dagger2course.common.dependencyinjection.app.AppModule
import com.techyourchance.dagger2course.common.dependencyinjection.app.DaggerAppComponent

class MyApplication: Application() {

    public val appComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
    }

}