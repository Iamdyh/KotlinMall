package com.dyh.usercenter.presenter

import com.dyh.base.ext.execute
import com.dyh.base.presenter.BasePresenter
import com.dyh.base.rx.BaseSubscriber
import com.dyh.usercenter.service.UserService
import com.dyh.usercenter.service.impl.UserServiceImpl
import com.dyh.usercenter.view.RegisterView
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

class RegisterPresenter @Inject constructor():BasePresenter<RegisterView>(){

    @Inject
    lateinit var userService: UserService

    fun register(mobile:String, verifyCode:String, pwd:String){
        //业务逻辑


        userService.register(mobile, verifyCode, pwd)
                .execute(object :BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })

    }


}
