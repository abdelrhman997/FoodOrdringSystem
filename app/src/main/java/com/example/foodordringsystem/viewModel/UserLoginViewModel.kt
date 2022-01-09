package com.example.foodordringsystem.viewModel

import android.util.Log
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData
import com.example.foodordringsystem.base.BaseViewModel
import com.example.foodordringsystem.model.UserLogin

class UserLoginViewModel:BaseViewModel() {
    private val TAG = "UserLoginViewModel"
    val userLogin = MutableLiveData<UserLogin> ()
    fun doLoginRequest(userLogin: UserLogin){
        Log.i(TAG, "doLoginRequest: "+userLogin.mobileNumber + "----------"+ userLogin.password)

    }
    fun handleSuccessResponse(){

    }
    fun handleErrorResponse(){

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }
}