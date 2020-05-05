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
        Bundle bundleSecond =this.getIntent().getExtras();

        final TextView serviceNum = findViewById(R.id.service_number);
        final TextView serviceUser = findViewById(R.id.service_sentence);
        assert bundleSecond != null;
        String name = bundleSecond.getString("name");
        double number = bundleSecond.getDouble("number");

        serviceUser.setText(name);
        serviceNum.setText(String.valueOf(number));


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