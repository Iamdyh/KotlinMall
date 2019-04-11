package com.dyh.usercenter.data.api

import com.dyh.base.data.protocol.BaseResponse
import com.dyh.usercenter.data.protocol.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

interface UserApi {
    @POST("userCenter/register")
    fun register(@Body req:RegisterRequest):Observable<BaseResponse<String>>
}