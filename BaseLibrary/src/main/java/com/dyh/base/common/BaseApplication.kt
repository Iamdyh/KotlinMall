package com.dyh.base.common

import android.app.Application
import com.dyh.base.injection.component.AppComponent
import com.dyh.base.injection.component.DaggerAppComponent
import com.dyh.base.injection.module.AppModule

class BaseApplication:Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        initAppInjection()
    }

    private fun initAppInjection(){
       appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}