package com.example.fueldeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.os.CountDownTimer;


/**
 * This is the SEVENTH PAGE of the FuelDeliveryApp.
 *
 * It focuses on receipt.
 */

public class Receipt extends AppCompatActivity {

    //Define the Date with/and Time
    TextView dateAndTime;
    TextView countDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        dateAndTime = findViewById(R.id.DateandTime);

        /*
        This is from a tutorial on YT
         */
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
        String dateTime = simpleDateFormat.format(calendar.getTime());
        dateAndTime.setText(dateTime);


        countDown = findViewById(R.id.timer);
        /*
        This part of the code is from StackOverflow
        */
        new CountDownTimer(59000, 1000){
            public void onTick(long millsec){
                countDown.setText("5:"+ millsec/1000);
            }

            @Override
            public void onFinish() {
                countDown.setText("");
            }
        }.start();

        /*
        This part of the code is from StackOverflow
        */
        Handler handler;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent start = new Intent(getApplicationContext(), Final.class);
                startActivity(start);
                finish();
            }
        }, 10000);

    }
}