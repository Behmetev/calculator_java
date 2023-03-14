package com.behmetev.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextAnswer = findViewById(R.id.editTextAnswer);
        Button button = findViewById(R.id.buttonAnswer);
        TextView wrongAnswer = findViewById(R.id.textViewInCorrectAnswer);
        TextView correctAnswer = findViewById(R.id.textViewCorrectAnswer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editTextAnswer.getText().toString();
                if (text.equals("15")) {
                    correctAnswer.setVisibility(View.VISIBLE);
                    wrongAnswer.setVisibility(View.GONE);
                } else {
                    wrongAnswer.setVisibility(View.VISIBLE);
                    correctAnswer.setVisibility(View.GONE);
                }
            }
        });
    }
}