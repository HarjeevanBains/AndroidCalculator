package com.example.harje.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    public final double calculate(String exp) {
        if(exp == ""){
            return 0;
        }
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '/') {
                double resultValue = Double.parseDouble(exp.substring(0, i)) / Double.parseDouble(exp.substring(i + 1, exp.length()));
                return resultValue;
            }
            if (exp.charAt(i) == '-') {
                double resultValue = Double.parseDouble(exp.substring(0, i)) - Double.parseDouble(exp.substring(i + 1, exp.length()));
                return resultValue;
            }
            if (exp.charAt(i) == '*') {
                double resultValue = Double.parseDouble(exp.substring(0, i)) * Double.parseDouble(exp.substring(i + 1, exp.length()));
                return resultValue;
            }
            if (exp.charAt(i) == '+') {
                double resultValue = Double.parseDouble(exp.substring(0, i)) + Double.parseDouble(exp.substring(i + 1, exp.length()));
                return resultValue;
            }
        }
        return Double.parseDouble(exp);
    }

    boolean answerSet = false;
    int operatorCounter = 0;
    int operatorRepeat = 0;
    int equalCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView result;
        result = findViewById(R.id.Result);


        final DecimalFormat df = new DecimalFormat("#.###");

        final Button nine = findViewById(R.id.nine);
        final Button eight = findViewById(R.id.eight);
        final Button seven = findViewById(R.id.seven);
        final Button six = findViewById(R.id.six);
        final Button five = findViewById(R.id.five);
        final Button four = findViewById(R.id.four);
        final Button three = findViewById(R.id.three);
        final Button two = findViewById(R.id.two);
        final Button one = findViewById(R.id.one);
        final Button zero = findViewById(R.id.zero);

        final Button clear = findViewById(R.id.clear);
        final Button multiply = findViewById(R.id.multiply);
        final Button add = findViewById(R.id.add);
        final Button minus = findViewById(R.id.minus);
        final Button divide = findViewById(R.id.divide);
        final Button equal = findViewById(R.id.equal);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.zero:
                        if (answerSet == false) {
                            result.setText(result.getText() + "0");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("0");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.one:
                        if (answerSet == false) {
                            result.setText(result.getText() + "1");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("1");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.two:
                        if (answerSet == false) {
                            result.setText(result.getText() + "2");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("2");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.three:
                        if (answerSet == false) {
                            result.setText(result.getText() + "3");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("3");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.four:
                        if (answerSet == false) {
                            result.setText(result.getText() + "4");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("4");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.five:
                        if (answerSet == false) {
                            result.setText(result.getText() + "5");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("5");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.six:
                        if (answerSet == false) {
                            result.setText(result.getText() + "6");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("6");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.seven:
                        if (answerSet == false) {
                            result.setText(result.getText() + "7");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("7");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.eight:
                        if (answerSet == false) {
                            result.setText(result.getText() + "8");
                            operatorRepeat = 0;
                            equalCounter = 0;
                        } else {
                            result.setText("8");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.nine:
                        if (answerSet == false) {
                            result.setText(result.getText() + "9");
                            equalCounter = 0;
                            operatorRepeat = 0;
                        } else {
                            result.setText("9");
                            operatorRepeat = 0;
                            equalCounter = 0;
                            answerSet = false;
                        }
                        break;
                    case R.id.clear:
                        result.setText("");
                        operatorRepeat = 0;
                        equalCounter = 0;
                        answerSet = false;
                        break;
                    case R.id.minus:
                        equalCounter = 0;
                        if (operatorRepeat != 0){
                            result.setText("invalid, press CLEAR to reset");
                            break;
                        }
                        if (operatorCounter == 0) {
                            result.setText(result.getText() + "-");
                            answerSet = false;
                            operatorCounter++;
                            operatorRepeat++;
                        } else {
                            result.setText("" + calculate(result.getText().toString()));
                            operatorCounter = 0;
                            minus.callOnClick();
                        }
                        break;
                    case R.id.multiply:
                        equalCounter = 0;
                        if (operatorRepeat != 0){
                            result.setText("invalid, press CLEAR to reset");
                            break;
                        }
                        if (operatorCounter == 0) {
                            result.setText(result.getText() + "*");
                            answerSet = false;
                            operatorCounter++;
                            operatorRepeat++;
                        } else {
                            result.setText("" + calculate(result.getText().toString()));
                            operatorCounter = 0;
                            multiply.callOnClick();
                        }
                        break;
                    case R.id.divide:
                        equalCounter = 0;
                        if (operatorRepeat != 0){
                            result.setText("invalid, press CLEAR to reset");
                            break;
                        }
                        if (operatorCounter == 0) {
                            result.setText(result.getText() + "/");
                            answerSet = false;
                            operatorCounter++;
                            operatorRepeat++;
                        } else {
                            result.setText("" + calculate(result.getText().toString()));
                            operatorCounter = 0;
                            divide.callOnClick();
                        }
                        break;
                    case R.id.add:
                        equalCounter = 0;
                        if (operatorRepeat != 0){
                            result.setText("invalid, press CLEAR to reset");
                            break;
                        }
                        if (operatorCounter == 0) {
                            result.setText(result.getText() + "+");
                            answerSet = false;
                            operatorCounter++;
                            operatorRepeat++;
                        } else {
                            result.setText("" + calculate(result.getText().toString()));
                            operatorCounter = 0;
                            add.callOnClick();
                        }
                        break;
                }
            }
        };
        zero.setOnClickListener(listener);
        one.setOnClickListener(listener);
        two.setOnClickListener(listener);
        three.setOnClickListener(listener);
        four.setOnClickListener(listener);
        five.setOnClickListener(listener);
        six.setOnClickListener(listener);
        seven.setOnClickListener(listener);
        eight.setOnClickListener(listener);
        nine.setOnClickListener(listener);
        clear.setOnClickListener(listener);
        minus.setOnClickListener(listener);
        multiply.setOnClickListener(listener);
        divide.setOnClickListener(listener);
        add.setOnClickListener(listener);

        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (operatorRepeat != 0){
                    result.setText("invalid, press CLEAR to reset");
                }
                else if(equalCounter == 0) {
                    double resultValue;
                    resultValue = calculate(result.getText().toString());
                    result.setText("" + df.format(resultValue));
                    answerSet = true;
                    operatorCounter = 0;
                    equalCounter++;
                }
            }
        });
    }
};