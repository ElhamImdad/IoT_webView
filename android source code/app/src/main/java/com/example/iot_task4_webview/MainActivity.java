package com.example.iot_task4_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView)findViewById(R.id.webview);
        myWebView.loadUrl("file:///android_asset/task1.html");
        myWebView.getSettings().setJavaScriptEnabled(true);
    }
}
