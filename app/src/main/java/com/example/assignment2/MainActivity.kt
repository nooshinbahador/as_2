package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_time.setOnClickListener {
            startActivity(Intent(applicationContext,Time_Activity::class.java))
        }

        button_map.setOnClickListener {
            startActivity(Intent(applicationContext,Map_Activity::class.java))
        }

        fab_time.setOnClickListener {
            startActivity(Intent(applicationContext,Time_Activity::class.java))
        }

        fab_map.setOnClickListener {
            startActivity(Intent(applicationContext,Map_Activity::class.java))
        }
    }
}
