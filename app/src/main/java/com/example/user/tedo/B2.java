package com.example.user.tedo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class B2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b2);
        WebView web = (WebView) findViewById(R.id.view);
        web.loadUrl("https://www.youtube.com/watch?v=FMYyfbZqdKA");
        web.setWebViewClient(new WebViewClient());

    }
}