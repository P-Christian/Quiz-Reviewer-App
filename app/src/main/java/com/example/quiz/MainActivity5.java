package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button correct4 = findViewById(R.id.correct4);
        Button xbtn7 = findViewById(R.id.xbtn7);
        Button xbtn8 = findViewById(R.id.xbtn8);

        correct4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });
        xbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });
        xbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });
    }
    @Override
    public void onClick(View view) {
        openActivity6();
    }
    public void openActivity6() {
        Intent intent = new Intent(this,MainActivity6.class);
        startActivity(intent);

    }
    public void opensplashScreen(){
        Intent intent = new Intent(this, splashScreen.class);
        startActivity(intent);
    }
}