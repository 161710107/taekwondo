package com.example.user.tedo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hitam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitam);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(8000);   // set the duration of splash screen
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                }
            }
        };
    }
}