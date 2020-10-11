package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String welcomeMessage;
    TextView TextViewWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        TextViewWelcome = findViewById(R.id.text);
        welcomeMessage = intent.getStringExtra("Welcome");

    }

    @Override
    protected void onResume() {
        super.onResume();

        TextViewWelcome.setText(welcomeMessage);
    }
}