package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.calculator.R.id.WebView

class web : AppCompatActivity() {
    lateinit var wb_view:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        wb_view=findViewById(WebView)
        webview()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun webview(){

        wb_view.webViewClient= WebViewClient()
        wb_view.apply {
            loadUrl("https/www.google.com")
            settings.javaScriptEnabled=true
            super.onBackPressed()

        }


    }

    override fun onBackPressed() {
        if (wb_view.canGoBack())wb_view.goBack() else
        super.onBackPressed()
    }
}