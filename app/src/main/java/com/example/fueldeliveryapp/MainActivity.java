package com.example.fueldeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * This is the MAIN PAGE and the first thing
 * that shows on the screen of the FuelDeliveryApp.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //OnClick activity for the button. Once button (CONTINUE button) is clicked
    //it will open a page
    public void openContinue(View view){
        //Intent-> is used to open a page
        Intent intent = new Intent(this, ContinuePage.class);

        //To start Intent
        startActivity(intent);
    }
}