package com.example.foodordringsystem.view

import android.util.Log
import androidx.lifecycle.ViewModelProviders
import androidx.databinding.library.baseAdapters.BR
import com.example.foodordringsystem.R
import com.example.foodordringsystem.base.BaseActivity
import com.example.foodordringsystem.databinding.ActivityUserLoginBinding
import com.example.foodordringsystem.model.UserLogin
import com.example.foodordringsystem.viewModel.UserLoginViewModel

class UserLoginActivity : BaseActivity<ActivityUserLoginBinding,UserLoginViewModel>() {
    override fun getBindingVariable(): Int = BR.loginViewModel

    override fun getViewModel(): UserLoginViewModel {

        return ViewModelProviders.of(this).get(UserLoginViewModel::class.java)
    }

    override fun getLayoutById(): Int {
        Log.i("TAG2113", "getLayoutById: ")
        return R.layout.activity_user_login
    }

    override fun init() {
        mViewDataBinding?.userDetails= UserLogin()
    }

}