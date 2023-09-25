package com.androchef.cameraxfacedetection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class launch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
    }

    fun startApp(view: View) {
        val intent = Intent(this,MainActivity::class.java);
        startActivity(intent)
    }
}