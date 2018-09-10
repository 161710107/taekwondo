package com.example.user.tedo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Fb extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView web = (WebView) findViewById(R.id.view);
        web.loadUrl("https://web.facebook.com/dina.srihartini");
        web.setWebViewClient(new WebViewClient());

    }
}