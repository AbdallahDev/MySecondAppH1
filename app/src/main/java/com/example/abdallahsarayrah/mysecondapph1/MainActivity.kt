package com.example.abdallahsarayrah.mysecondapph1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    var x = 0
    fun change(v: View) {
        if (x == 0) {
            imageView.setImageResource(R.drawable.b)
            x = 1
        } else {
            imageView.setImageResource(R.drawable.a)
            x = 0
        }
    }
}

