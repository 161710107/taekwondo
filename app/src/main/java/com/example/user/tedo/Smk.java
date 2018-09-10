package com.example.user.tedo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Smk extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smk);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView web = (WebView) findViewById(R.id.view);
        web.loadUrl("https://smkassalaambandung.sch.id/");
        web.setWebViewClient(new WebViewClient());

    }
}