package com.example.gnumoa2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NoticeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice)

        val intent = Intent(this, HeartActivity::class.java)
    }
}

