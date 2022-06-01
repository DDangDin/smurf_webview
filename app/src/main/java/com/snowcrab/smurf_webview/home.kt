package com.snowcrab.smurf_webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class home : AppCompatActivity() {
    private lateinit var btn_video: ImageButton
    private lateinit var btn_set: ImageButton
    private lateinit var imgView_hidden: ImageView
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
        imgView_hidden = findViewById(R.id.img_hidden)
        imgView_video = findViewById(R.id.imgView_video)
        btn_set = findViewById(R.id.btn_set)

        val intent_mainPage = Intent(this, MainActivity::class.java)

        btn_video.setOnClickListener{
            startActivity(intent_mainPage)
        }

        btn_set.setOnClickListener {
            if(edittext_URL.text.isNotEmpty()){
                url = edittext_URL.text.toString()
                imgView_hidden.visibility = View.INVISIBLE
                btn_video.visibility = View.VISIBLE
                Toast.makeText(this, "URL 설정 완료", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "URL 오류", Toast.LENGTH_SHORT).show()
            }
        }

    }
}