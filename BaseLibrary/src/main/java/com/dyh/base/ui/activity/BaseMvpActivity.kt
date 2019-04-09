package com.dyh.base.ui.activity

import com.dyh.base.presenter.BasePresenter
import com.dyh.base.presenter.view.BaseView

open class BaseMvpActivity<T: BasePresenter<*>>:BaseActivity(),BaseView{
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError() {

    }

    lateinit var mPresenter:T
}