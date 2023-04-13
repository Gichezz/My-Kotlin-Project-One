package com.example.morningprojectone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity : AppCompatActivity() {
    lateinit var mWeb:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website)
        mWeb = findViewById(R.id.mWebsite)
        val webSettings = mWeb.settings
        webSettings.javaScriptEnabled = true
        mWeb.loadUrl("https://www.emobilis.ac.ke")
    }
}