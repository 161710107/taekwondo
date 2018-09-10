package com.example.user.tedo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class HomeScreen extends Activity {
    ImageButton gmail;
   ImageButton dataku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        gmail = (ImageButton) findViewById(R.id.mail);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeScreen.this, Smk.class);
                startActivityForResult(i, 0);
            }
        });
        dataku = (ImageButton) findViewById(R.id.btn_dataini);
        dataku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeScreen.this, MainActivity.class);
                startActivityForResult(i, 0);
            }
        });



    }


    }



