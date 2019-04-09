package com.dyh.usercenter.view

import com.dyh.base.presenter.view.BaseView

interface RegisterView: BaseView {
    fun onRegisterResult(result: Boolean)
}