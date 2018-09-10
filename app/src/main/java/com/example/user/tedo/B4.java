package com.example.user.tedo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class B4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b4);
        WebView web = (WebView) findViewById(R.id.view);
        web.loadUrl("https://www.youtube.com/watch?v=YZIUSN0AwRY");
        web.setWebViewClient(new WebViewClient());

    }
}