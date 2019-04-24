package com.dyh.base.injection.module

import android.app.Activity
import android.content.Context
import com.dyh.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providesActivity():Activity{
        return activity
    }
}