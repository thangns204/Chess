package com.example.thangns.chess;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by thangns on 1/26/19.
 */

//this class Activity when it extends AppCompatActivity
//Can cho he thong biet chung ta co 1 WelcomeActivity , chung ta se khai boa chung trong mainfests(AndroidMainfest.xml)

public class WelcomeActivity extends AppCompatActivity{
    //voi vong doi cua activity , no se goi phuong thuc onCretae dau tien

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_welcome);


        //get Button from layout byId, owner create before
        Button button = findViewById(R.id.button_play2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code for when click the button
                //Toast.makeText(WelcomeActivity.this, "LOL", Toast.LENGTH_SHORT).show();
                //transfer different activity
                Intent intent = new Intent();
                intent.setClass(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
