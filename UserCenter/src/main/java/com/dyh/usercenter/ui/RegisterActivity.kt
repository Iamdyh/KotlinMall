package com.dyh.usercenter.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dyh.base.ui.activity.BaseMvpActivity
import com.dyh.usercenter.R
import com.dyh.usercenter.injection.component.DaggerUserComponent
import com.dyh.usercenter.injection.module.UserModule
import com.dyh.usercenter.presenter.RegisterPresenter
import com.dyh.usercenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast


class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initInjection()


        mRegisterBtn.setOnClickListener {
            mPresenter.register(mMobileEt.text.toString(), mVerifyCodeEt.text.toString(), mPwdEt.text.toString())
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

    private fun initInjection(){

        DaggerUserComponent.builder().userModule(UserModule()).build().inject(this)
        mPresenter.mView = this
    }
}
