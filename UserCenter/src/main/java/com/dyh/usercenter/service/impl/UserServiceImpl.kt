package com.dyh.usercenter.service.impl

import com.dyh.base.data.protocol.BaseResponse
import com.dyh.base.rx.BaseException
import com.dyh.usercenter.data.repository.UserRepository
import com.dyh.usercenter.service.UserService
import rx.Observable
import rx.functions.Func1

class UserServiceImpl:UserService{
    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {
        val respository = UserRepository()
        return respository.register(mobile,pwd, verifyCode)
                .flatMap(object :Func1<BaseResponse<String>, Observable<Boolean>>{
                    override fun call(t: BaseResponse<String>): Observable<Boolean> {
                        if(t.status != 0){
                            return Observable.error(BaseException(t.status, t.message))
                        }
                        return Observable.just(true)
                    }
                })
    }

}