package com.example.myapplication.common

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun <T:View> Activity.findView(viewId:Int):Lazy<T> = lazy { findViewById(viewId) }

}