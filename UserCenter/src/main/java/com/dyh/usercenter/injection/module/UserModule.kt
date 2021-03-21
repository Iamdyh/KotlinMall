package com.dyh.usercenter.injection.module

import com.dyh.usercenter.service.UserService
import com.dyh.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * <p>
 * user module
 * </p >
 * @author douyanghui
 * @date： 2021/3/21
 */
@Module
class UserModule()  {

    @Provides
    fun providesUserService(service: UserServiceImpl):UserService{
        return service
    }
}