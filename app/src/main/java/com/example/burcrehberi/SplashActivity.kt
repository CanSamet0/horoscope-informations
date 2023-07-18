package com.example.burcrehberi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import android.widget.ImageView

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val splashRotate = AnimationUtils.loadAnimation(this, R.anim.splash_rotate)
        val splashImage = findViewById<ImageView>(R.id.imageViewSplashImage)
        splashImage.animation = splashRotate

    }

    override fun onResume() {
        object: CountDownTimer(5000,1000){
            override fun onTick(p0: Long) {}

            override fun onFinish() {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }.start()
        super.onResume()
    }
}