package com.example.foodordringsystem.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.foodordringsystem.R

class SplashActivity : AppCompatActivity() {
    var anim : Animation ?= null
    var imageView: ImageView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        imageView=findViewById(R.id.imageView2)
        anim = AnimationUtils.loadAnimation(
            applicationContext,
            android.R.anim.fade_in
        ) // Create the animation.

        anim!!.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}
            override fun onAnimationEnd(animation: Animation) {
                startActivity(Intent(applicationContext, UserLoginActivity::class.java))
                // HomeActivity.class is the activity to go after showing the splash screen.
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })

        imageView!!.startAnimation(anim);
    }
}