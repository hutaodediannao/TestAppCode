package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.common.BaseActivity

private const val TAG = "MainActivity"

class MainActivity : BaseActivity() {

    private val btn by findView<Button>(R.id.btn)
    private val btn2 by findView<Button>(R.id.btn2)
    private val btn3 by findView<Button>(R.id.btn3)
    private val tv by findView<TextView>(R.id.tv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)

        btn.setOnClickListener {
            testAnim()
        }

        btn2.setOnClickListener {
            for (i in 0..5) {
                Thread.sleep(50)
                Log.i(TAG, "testAnim: =========> $i")
            }
            Toast.makeText(this, "02", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            for (i in 0..5) {
                Log.i(TAG, "testAnim: =========> $i")
            }
            Toast.makeText(this, "03", Toast.LENGTH_SHORT).show()
        }
    }

    private fun testAnim() {
        for (i in 0..5) {
            Thread.sleep(500)
            Log.i(TAG, "testAnim: =========> $i")
        }
    }
}
