package com.example.fueldeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * This is the SIXTH PAGE of the FuelDeliveryApp.
 *
 * It focuses on the page loading and completing payment.
 */

public class LoadingPage extends AppCompatActivity {

    /**
     * In this activity this page will take up to 3 seconds to load
     * as it is processing the client's payment.
     */

    /*
    This part of the code is from StackOverflow.
     */
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);

        /*
        Once 3 secs have passed it will go on to the next page,
        which is where the user receives a receipt.
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent start = new Intent(getApplicationContext(), Receipt.class);
                startActivity(start);
                finish();
            }
        }, 2500);

    }
}