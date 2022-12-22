package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button correct2 = findViewById(R.id.correct2);
        Button xbtn3 = findViewById(R.id.xbtn3);
        Button xbtn4 = findViewById(R.id.xbtn4);

        correct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
        xbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });
        xbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });
    }

    public void onClick(View view) {openActivity4();}
    public void openActivity4() {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void opensplashScreen(){
        Intent intent = new Intent(this, splashScreen.class);
        startActivity(intent);
    }
}