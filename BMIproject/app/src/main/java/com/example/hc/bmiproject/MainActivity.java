package com.example.hc.bmiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        progressBar.setVisibility(View.VISIBLE);
        Thread start = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent Start = new Intent(getApplicationContext(),BmiCalculator.class);
                    startActivity(Start);
                     finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
           start.start();
    }
}
