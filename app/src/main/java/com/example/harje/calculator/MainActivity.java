package com.example.harje.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    boolean answerSet = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView result;
        result = (TextView) findViewById(R.id.Result);

        Double ValueOne, ValueTwo;

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
                        } else {
                            result.setText("0");
                            answerSet = false;
                        }
                        break;
                    case R.id.one:
                        if (answerSet == false) {
                            result.setText(result.getText() + "1");
                        } else {
                            result.setText("1");
                            answerSet = false;
                        }
                        break;
                    case R.id.two:
                        if (answerSet == false) {
                            result.setText(result.getText() + "2");
                        } else {
                            result.setText("2");
                            answerSet = false;
                        }
                        break;
                    case R.id.three:
                        if (answerSet == false) {
                            result.setText(result.getText() + "3");
                        } else {
                            result.setText("3");
                            answerSet = false;
                        }
                        break;
                    case R.id.four:
                        if (answerSet == false) {
                            result.setText(result.getText() + "4");
                        } else {
                            result.setText("4");
                            answerSet = false;
                        }
                        break;
                    case R.id.five:
                        if (answerSet == false) {
                            result.setText(result.getText() + "5");
                        } else {
                            result.setText("5");
                            answerSet = false;
                        }
                        break;
                    case R.id.six:
                        if (answerSet == false) {
                            result.setText(result.getText() + "6");
                        } else {
                            result.setText("6");
                            answerSet = false;
                        }
                        break;
                    case R.id.seven:
                        if (answerSet == false) {
                            result.setText(result.getText() + "7");
                        } else {
                            result.setText("7");
                            answerSet = false;
                        }
                        break;
                    case R.id.eight:
                        if (answerSet == false) {
                            result.setText(result.getText() + "8");
                        } else {
                            result.setText("8");
                            answerSet = false;
                        }
                        break;
                    case R.id.nine:
                        if (answerSet == false) {
                            result.setText(result.getText() + "9");
                        } else {
                            result.setText("9");
                            answerSet = false;
                        }
                        break;
                    case R.id.clear:
                        result.setText("");
                        answerSet = false;
                        break;
                    case R.id.minus:
                        result.setText(result.getText() + "-");
                        answerSet = false;
                        break;
                    case R.id.multiply:
                        result.setText(result.getText() + "*");
                        answerSet = false;
                        break;
                    case R.id.divide:
                        result.setText(result.getText() + "/");
                        answerSet = false;
                        break;
                    case R.id.add:
                        result.setText(result.getText() + "+");
                        answerSet = false;
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
                double resultValue = 0;
                String exp = result.getText().toString();

                for (int i = 0; i < exp.length(); i++) {
                    if (exp.charAt(i) == '/') {
                        resultValue = Double.parseDouble(exp.substring(0, i)) / Double.parseDouble(exp.substring(i + 1, exp.length()));
                    }
                    if (exp.charAt(i) == '-') {
                        resultValue = Double.parseDouble(exp.substring(0, i)) - Double.parseDouble(exp.substring(i + 1, exp.length()));
                    }
                    if (exp.charAt(i) == '*') {
                        resultValue = Double.parseDouble(exp.substring(0, i)) * Double.parseDouble(exp.substring(i + 1, exp.length()));
                    }
                    if (exp.charAt(i) == '+') {
                        resultValue = Double.parseDouble(exp.substring(0, i)) + Double.parseDouble(exp.substring(i + 1, exp.length()));
                    }
                }
                result.setText("" + df.format(resultValue));
                answerSet = true;
            }
        });
    }
};