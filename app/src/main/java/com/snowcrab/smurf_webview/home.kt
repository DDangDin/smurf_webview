package com.snowcrab.smurf_webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

class home : AppCompatActivity() {
    private lateinit var btn_video: ImageButton
    private lateinit var btn_set: Button
    private lateinit var imgView_video: ImageView
    private lateinit var edittext_URL: EditText

    companion object{
        lateinit var url: String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        edittext_URL = findViewById(R.id.input_url)
        btn_video = findViewById(R.id.btn_video)
        imgView_video = findViewById(R.id.imgView_video)
        btn_set = findViewById(R.id.btn_set)

        val intent_mainPage = Intent(this, MainActivity::class.java)

        btn_video.setOnClickListener{
            startActivity(intent_mainPage)
        }

        btn_set.setOnClickListener {
            url = edittext_URL.text.toString()
        }

    }
}