package com.dyh.base.presenter

import com.dyh.base.presenter.view.BaseView

open class BasePresenter<T:BaseView> {

    lateinit var mView:T
}