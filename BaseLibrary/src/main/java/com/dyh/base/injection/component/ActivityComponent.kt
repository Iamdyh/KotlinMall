package com.dyh.base.injection.component

import android.app.Activity
import android.content.Context
import com.dyh.base.injection.ActivityScope
import com.dyh.base.injection.module.ActivityModule
import com.dyh.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun activity(): Activity
}