package com.example.acc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final int[] randomNumber = new int[]{0};
    final String[] userName = new String[1];
    final Random number = new Random();
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //user
        final TextView serviceOutput = findViewById(R.id.service_output);
        final EditText nameInput = findViewById(R.id.name_input);

        //button
        Button random = findViewById(R.id.random);
        Button start =  findViewById(R.id.start);
        Button stop =  findViewById(R.id.stop);

        //event
        random.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                setContentView(R.layout.activity_second);
                final TextView serviceNum = findViewById(R.id.service_number);
                final TextView serviceUser = findViewById(R.id.service_sentence);
                userName[0] = nameInput.getText().toString().trim();
                randomNumber[0] = number.nextInt(6) + 1;
                serviceUser.setText(userName[0] + " got number " );
                serviceNum.setText(String.valueOf(randomNumber[0]));

            }
        });

        start.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                userName[0] = nameInput.getText().toString().trim();
                randomNumber[0] = number.nextInt(6) + 1;
                if (userName[0].length() == 0)
                    serviceOutput.setText("");
                else
                    serviceOutput.setText(userName[0] + " got number " + randomNumber[0]);
            }
        });

        stop.setOnClickListener(new Button.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                serviceOutput.setText("stop");
            }
        });
    }

}