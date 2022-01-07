package com.example.fcm_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // 툴바에 타이틀 넣기
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        toolbar.title = "Example!"
        setSupportActionBar(toolbar)
        if (supportActionBar != null) supportActionBar!!.setDisplayHomeAsUpEnabled(false) //툴바에 백키(<-) 보이게할거면 이거 사용
    }
}

