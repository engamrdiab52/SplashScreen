package com.amrabdelhamiddiab.spalashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private val runnable = Runnable {
        if (!isFinishing){
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }
    }
    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable, 2000)
    }
    override fun onPause(){
        super.onPause()
        handler.removeCallbacks(runnable)
    }
}