package com.example.user.tedo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;



public class ScrollableTabsActivity extends Activity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollable_tabs);
        b1 = (Button) findViewById(R.id.ho);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScrollableTabsActivity.this, B1.class);
                startActivityForResult(i, 0);
            }
        });
        b2 = (Button) findViewById(R.id.ha);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScrollableTabsActivity.this, B2.class);
                startActivityForResult(i, 0);
            }
        });
        b3 = (Button) findViewById(R.id.he);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScrollableTabsActivity.this, B3.class);
                startActivityForResult(i, 0);
            }
        });
        b4 = (Button) findViewById(R.id.hi);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ScrollableTabsActivity.this, B4.class);
                startActivityForResult(i, 0);
            }
        });
    }
}
