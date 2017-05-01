package com.example.hc.bmiproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by User on 4/30/2017.
 */

public class BmiCalculator extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        final CheckBox ch = (CheckBox) findViewById(R.id.checkBox);
        final CheckBox ch1 = (CheckBox) findViewById(R.id.checkBox2);
        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            AlertDialog ad = adb.create();
            @Override
            public void onClick(View v) {
                if(ch.isChecked() == true && ch1.isChecked() == false){
                    Intent male = new Intent(BmiCalculator.this,Male.class);
                    startActivity(male);
                }
                if(ch1.isChecked() == true && ch.isChecked() == false){
                    Intent female = new Intent(BmiCalculator.this,Female.class);
                    startActivity(female);
                }
                if(ch.isChecked() == true && ch1.isChecked() == true){
                      ad.setMessage("เลือกให้ถูกต้อง");
                      ad.show();
                }
            }
        });
    }
}
