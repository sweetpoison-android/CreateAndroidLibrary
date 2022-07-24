package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswer = findViewById(R.id.tvAnswer);

        String strNum1 = getIntent().getStringExtra("number1");
        String strNum12 = getIntent().getStringExtra("number2");
        String strEquation = getIntent().getStringExtra("equation");

      int anser =  equation(Integer.parseInt(strNum1), Integer.parseInt(strNum12), strEquation);
      tvAnswer.setText(anser+"");
    }

    public int equation(int num1, int num2,String cal)
    {
        if (cal.equalsIgnoreCase("+") || cal.equalsIgnoreCase("add") || cal.equalsIgnoreCase("addition"))
        {
           return num1+num2;

        }
       else if (cal.equalsIgnoreCase("-") || cal.equalsIgnoreCase("sub") || cal.equalsIgnoreCase("substraction"))
        {
            return num1-num2;
        }
        else if (cal.equalsIgnoreCase("/") || cal.equalsIgnoreCase("div") || cal.equalsIgnoreCase("divide"))
        {
            return num1/num2;
        }
        else if (cal.equalsIgnoreCase("*") || cal.equalsIgnoreCase("mul") || cal.equalsIgnoreCase("multiplication"))
        {
            return num1*num2;
        }
        else
        {
            Toast.makeText(this, "please enter correct euation", Toast.LENGTH_SHORT).show();
        }
        return 0;
    }
}