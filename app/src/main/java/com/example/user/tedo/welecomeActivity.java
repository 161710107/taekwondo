package com.example.user.tedo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class welecomeActivity extends AppCompatActivity{
    LinearLayout l1,l2;
    Button btnsub;
    Animation uptodown,downtoup;
    Button biodata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welecome);

        btnsub = (Button)findViewById(R.id.buttonsub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(welecomeActivity.this, HomeScreen.class);
                startActivityForResult(i, 0);
            }
        });
        l1 = (LinearLayout) findViewById(R.id.l1);
        l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);
        biodata = (Button) findViewById(R.id.data);
        biodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(welecomeActivity.this, Data.class);
                startActivityForResult(i, 0);
            }
        });
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
