package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button correct3 = findViewById(R.id.correct3);
        Button xbtn5 = findViewById(R.id.xbtn5);
        Button xbtn6 = findViewById(R.id.xbtn6);

        correct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });
        xbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });
        xbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensplashScreen();
            }
        });
    }

    public void onClick(View view)
    {
        openActivity5();
    }
    public void openActivity5() {
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
    public void opensplashScreen(){
        Intent intent = new Intent(this, splashScreen.class);
        startActivity(intent);
    }
}