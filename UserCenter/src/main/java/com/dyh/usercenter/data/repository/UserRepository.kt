package com.dyh.usercenter.data.repository

import com.dyh.base.data.net.RetrofitFactory
import com.dyh.base.data.protocol.BaseResponse
import com.dyh.usercenter.data.api.UserApi
import com.dyh.usercenter.data.protocol.RegisterRequest
import rx.Observable

class UserRepository {
    fun register(mobile:String, pwd:String, verifyCode:String): Observable<BaseResponse<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java).register(RegisterRequest(mobile, pwd, verifyCode))
}
}