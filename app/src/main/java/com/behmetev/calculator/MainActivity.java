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
        TextView example = findViewById(R.id.textViewExample);

        //подучаем рандомные целые числа от 1 до 99
        int random_number1 = 1 + (int) (Math.random() * 99);
        int random_number2 = 1 + (int) (Math.random() * 99);

        example.setText(random_number1 + " + " + random_number2 + " = ?");

        int answer = random_number1 + random_number2;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editTextAnswer.getText().toString();

                //todo: переделать преобразование типов
                //todo: рестарт активности с новыми данными
                if (Integer.parseInt(text) == answer) {
                    correctAnswer.setVisibility(View.VISIBLE);
                    wrongAnswer.setVisibility(View.GONE);
                } else {
                    correctAnswer.setVisibility(View.GONE);
                    wrongAnswer.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}