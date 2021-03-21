package com.dyh.base.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.dyh.base.common.BaseApplication
import com.dyh.base.injection.component.ActivityComponent
import com.dyh.base.injection.component.DaggerActivityComponent
import com.dyh.base.injection.module.ActivityModule
import com.dyh.base.presenter.BasePresenter
import com.dyh.base.presenter.view.BaseView
import javax.inject.Inject

open class BaseMvpActivity<T: BasePresenter<*>>:BaseActivity(),BaseView{
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError() {

    }

    @Inject
    lateinit var mPresenter:T

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initActivityInjection()
    }

    private fun initActivityInjection(){
        activityComponent = DaggerActivityComponent.builder().appComponent((application as BaseApplication).appComponent).activityModule(ActivityModule(this)).build()
    }
}