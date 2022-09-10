package com.agrima.portfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ResumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)
    }
    fun View_Resume(view: View) {
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://drive.google.com/file/d/1NQZBuwnO0qIt9JLAU0DqHGOP5HQEBIYe/view?usp=sharing"))
        startActivity(intent)
    }
}