package com.snowcrab.smurf_webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class home : AppCompatActivity() {
    private lateinit var btn_video: ImageButton
    private lateinit var imgView_video: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_video = findViewById(R.id.btn_video)
        imgView_video = findViewById(R.id.imgView_video)

        val intent_mainPage = Intent(this, MainActivity::class.java)

        btn_video.setOnClickListener{
            startActivity(intent_mainPage)
        }
    }
}