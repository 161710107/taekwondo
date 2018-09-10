package com.example.user.tedo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton bodas;
    private ImageButton koneng;
    private ImageButton hejo;
    private  ImageButton biruu;
    private ImageButton berem;
    private ImageButton item;
    private ImageButton btnSimpleTabs;
    private ImageButton bisik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bodas = (ImageButton) findViewById(R.id.putih);
        bodas.setOnClickListener(this);

        koneng = (ImageButton) findViewById(R.id.kuning);
        koneng.setOnClickListener(this);

        hejo = (ImageButton) findViewById(R.id.hijau);
        hejo.setOnClickListener(this);

        biruu = (ImageButton) findViewById(R.id.biru);
        biruu.setOnClickListener(this);

        berem = (ImageButton) findViewById(R.id.merah);
        berem.setOnClickListener(this);

        item = (ImageButton) findViewById(R.id.hitam);
        item.setOnClickListener(this);

        btnSimpleTabs = (ImageButton) findViewById(R.id.fisik);
        btnSimpleTabs.setOnClickListener(this);

        bisik = (ImageButton) findViewById(R.id.basic);
        bisik.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fisik:
                startActivity(new Intent(MainActivity.this, SimpleTabsActivity.class));
                break;
            case R.id.putih:
                startActivity(new Intent(MainActivity.this, Putih.class));
                break;
            case R.id.kuning:
                startActivity(new Intent(MainActivity.this, Kuning.class));
                break;
            case R.id.hijau:
                startActivity(new Intent(MainActivity.this, Hijau.class));
                break;
            case R.id.biru:
                startActivity(new Intent(MainActivity.this, Biru.class));
                break;
            case R.id.merah:
                startActivity(new Intent(MainActivity.this, Merah.class));
                break;
            case R.id.hitam:
                startActivity(new Intent(MainActivity.this, Hitam.class));
                break;
            case R.id.basic:
                startActivity(new Intent(MainActivity.this, ScrollableTabsActivity.class));
                break;
        }
    }
}