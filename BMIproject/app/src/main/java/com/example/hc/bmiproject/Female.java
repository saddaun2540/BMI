package com.example.hc.bmiproject;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by User on 4/30/2017.
 */

public class Female extends Activity {
    public double BMI;
    private DecimalFormat decimal  = new DecimalFormat("#.#");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.famale);
           final EditText height = (EditText) findViewById(R.id.editText);
           final EditText weight = (EditText) findViewById(R.id.weight);
           height.setGravity(Gravity.RIGHT);
           weight.setGravity(Gravity.RIGHT);
           final TextView show = (TextView) findViewById(R.id.BMI);
           final TextView value = (TextView) findViewById(R.id.value);
           final Button bmi = (Button) findViewById(R.id.button2);
            bmi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double h = Double.parseDouble(height.getText().toString())/100;
                    double w = Double.parseDouble(weight.getText().toString());
                    double BBB= h*h;
                    BMI = w/BBB;
                    show.setText(String.valueOf(decimal.format(BMI)));
                    if(BMI >0 && BMI <= 18.5){
                        value.setText("ผอมเกินไป");
                        value.setTextColor(Color.YELLOW);
                    }
                    if(BMI >= 18.6 && BMI <= 22.9){
                        value.setText("สมส่วน");
                        value.setTextColor(Color.GREEN);
                    }
                    if(BMI >= 23 && BMI <= 24.9){
                        value.setText("น้ำหนักเกิน");
                        value.setTextColor(Color.BLUE);
                    }
                    if(BMI >= 25 && BMI <= 29.9){
                        value.setText("อ้วน");
                        value.setTextColor(Color.RED);
                    }
                    if(BMI >= 30 ){
                        value.setText("อ้วนอันตราย");
                        value.setTextColor(Color.BLACK);
                    }
                }
            });
    }


}
