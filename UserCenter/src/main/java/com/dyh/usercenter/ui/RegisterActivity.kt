package com.dyh.usercenter.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dyh.base.ui.activity.BaseMvpActivity
import com.dyh.usercenter.R
import com.dyh.usercenter.presenter.RegisterPresenter
import com.dyh.usercenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast


class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        mRegisterBtn.setOnClickListener {
            mPresenter.register("", "", "")
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }
}