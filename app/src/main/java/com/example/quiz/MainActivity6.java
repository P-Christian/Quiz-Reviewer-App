package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button correct5 = findViewById(R.id.correct5);
        Button xbtn9 = findViewById(R.id.wrong1);
        Button xbtn10 = findViewById(R.id.wrong2);

        correct5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });
        xbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });
        xbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();

            }
        });
    }

    public void onClick(View view) {
        openActivity7();
    }
    public void openActivity7() {
        Intent intent = new Intent(this,MainActivity7.class);
        startActivity(intent);
    }
    public void opensplashScreen() {
        Intent intent = new Intent(this, splashScreen.class);
        startActivity(intent);
    }
}