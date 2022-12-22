package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button correct1 = findViewById(R.id.correct1);
        Button xbtn1 = findViewById(R.id.xbtn1);
        Button xbtn2 = findViewById(R.id.xbtn2);

        correct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        xbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });
        xbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });

    }

    public void openActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void opensplashScreen(){
        Intent intent = new Intent(this, splashScreen.class);
        startActivity(intent);
    }
}