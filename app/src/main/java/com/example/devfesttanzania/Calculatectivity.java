package com.example.devfesttanzania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Calculatectivity extends AppCompatActivity {
Calculator mCalculator;
    TextView resultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        resultsTextView = (TextView) findViewById(R.id.tvResults);
        mCalculator = new Calculator();
    }

    public void clickHandler(View view){
        String stringX = ((EditText) findViewById(R.id.etX)).getText().toString();
        int x = Integer.parseInt(stringX);
        String stringY = ((EditText) findViewById(R.id.etY)).getText().toString();
        int y = Integer.parseInt(stringY);
        int result;
        float result_divition;
        int id = view.getId();

        switch (id){
            case R.id.add:
                result = mCalculator.add(x,y);
                //resultsTextView.setText(Integer.toString(result));
                resultsTextView.setText(String.format(Locale.ENGLISH,"%d", result));
                break;
            case R.id.subtract:
                result = mCalculator.subrack(x,y);
                resultsTextView.setText(String.format(Locale.ENGLISH,"%d", result));
                break;
            case R.id.multiply:
                result = mCalculator.multiply(x,y);
                resultsTextView.setText(String.format(Locale.ENGLISH,"%d", result));
                break;
            case R.id.divide:
                result_divition = mCalculator.divide(x,y);
                resultsTextView.setText(String.format(Locale.ENGLISH,"%f", result_divition));
                break;
        }


    }
}
