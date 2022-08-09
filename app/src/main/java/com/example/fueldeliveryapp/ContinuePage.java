package com.example.fueldeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This is the SECOND PAGE of the FuelDeliveryApp.
 *
 * It focuses more on the user choosing which type of fuel
 * they would like to refuel in their car
 */

public class ContinuePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_page);

        /**
         * Any button that will be checked will open
         * a new page for the user to do the
         * next activity required.
         */
        //set the three RadioButtons: petrol, diesel, electric charging
        final RadioButton petrolButton = (RadioButton) findViewById(R.id.petrol);
        final RadioButton dieselButton = (RadioButton) findViewById(R.id.diesel);
        final RadioButton electricButton = (RadioButton) findViewById(R.id.electric);

        //set the button: OK
        final Button okButton = (Button) findViewById(R.id.ok);

        //Define what each buttons do when checked
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(petrolButton.isChecked())
                {
                    //If petrol button is checked then open a new page
                    Intent intent = new Intent(ContinuePage.this, Options.class);
                    startActivity(intent);
                    setContentView(R.layout.activity_options_page);
                }
                else if(dieselButton.isChecked())
                {
                    //if diesel button is checked then open a new page
                    Intent intent = new Intent(ContinuePage.this, Options.class);
                    startActivity(intent);
                    setContentView(R.layout.activity_options_page);
                }
                else if(electricButton.isChecked())
                {
                    //if electric charging button is checked then open a new page
                    Intent intent = new Intent(ContinuePage.this, Options.class);
                    startActivity(intent);
                    setContentView(R.layout.activity_options_page);
                }
                else
                {
                    //In case none of these are checked then display and error message
                    Toast.makeText(getApplicationContext(), "Choose one of the following items", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}