package com.example.foodordringsystem.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T: ViewDataBinding ,V:BaseViewModel>:AppCompatActivity() {
    var mViewDataBinding: T? =null
    lateinit var mViewModel:V
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        initializeViewBinding()
    }

    private fun initializeViewBinding() {
        mViewDataBinding=DataBindingUtil.setContentView(this,getLayoutById())
        this.mViewModel= if(!::mViewModel.isInitialized)getViewModel() else mViewModel
        mViewDataBinding?.setVariable(getBindingVariable(),mViewModel)
        mViewDataBinding?.executePendingBindings()
    }

    abstract fun getBindingVariable(): Int

    abstract fun getViewModel(): V

    abstract fun getLayoutById(): Int
    abstract fun init()
}