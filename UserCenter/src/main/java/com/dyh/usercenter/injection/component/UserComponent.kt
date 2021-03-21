package com.dyh.usercenter.injection.component

import com.dyh.base.injection.PerComponentScope
import com.dyh.base.injection.component.ActivityComponent
import com.dyh.usercenter.injection.module.UserModule
import com.dyh.usercenter.ui.RegisterActivity
import dagger.Component

/**
 * <p>
 * user component
 * </p >
 * @author douyanghui
 * @date： 2021/3/21
 */
@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class), modules =  arrayOf(UserModule::class))
interface UserComponent {
    fun inject(activity: RegisterActivity)
}