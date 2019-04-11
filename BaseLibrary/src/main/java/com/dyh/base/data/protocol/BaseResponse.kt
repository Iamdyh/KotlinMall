package com.dyh.base.data.protocol

//基础响应类
class BaseResponse<out T> (val status:Int, val message:String, val data:T)