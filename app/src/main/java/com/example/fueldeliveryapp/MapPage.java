package com.example.fueldeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * This is the FOURTH PAGE of the FuelDeliveryApp.
 *
 * It focuses on the user choosing a nearby filling station
 * service in the map.
 */

public class MapPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_page);

        //Inform the user to select a location on the map
        Toast.makeText(getApplicationContext(), "Select a location on the map", Toast.LENGTH_LONG).show();


        //Define the back and ok button
        final Button backButton2 = (Button) findViewById(R.id.back2);
        final Button okButton3 = (Button) findViewById(R.id.ok3);

        //set the back button to go to a previous page
        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //using Intent will to open a page
                Intent intent = new Intent(getApplicationContext(), Options.class);
                startActivity(intent);
                finish();
            }
        });

        //set the ok button to go another page
        okButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Location will be Edinburgh
                Toast.makeText(getApplicationContext(), "Location: EDINBURGH", Toast.LENGTH_SHORT).show();

                //using Intent will to open a page
                Intent intent = new Intent(getApplicationContext(), CardPayment.class);
                startActivity(intent);
                setContentView(R.layout.activity_card_payment);
            }
        });
    }
}