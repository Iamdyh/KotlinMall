package com.dyh.usercenter.data.protocol

data class RegisterRequest(val mobile:String, val pwd:String, val verifyCode:String) {
}