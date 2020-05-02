package com.example.acc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    Button restart = findViewById(R.id.restart);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        restart.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                SecondActivity.this.finish();
            }
        });
    }

}