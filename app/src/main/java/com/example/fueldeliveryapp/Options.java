package com.example.fueldeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * This is the THIRD PAGE of the FuelDeliveryApp.
 *
 * It focuses on the car details of the user
 * and how much they will pay for the refuelling
 */

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_page);

        //Define the text the user will type
        final EditText plateNo = (EditText) findViewById(R.id.ThePlateNumber);
        final EditText makeOfCar = (EditText) findViewById(R.id.TheMake);
        final EditText colorOfCar = (EditText) findViewById(R.id.TheColor);
        final EditText paymentForFuel = (EditText) findViewById(R.id.payement);


        //Define the back button and ok button
        final Button backButton = (Button) findViewById(R.id.Back);
        final Button okButton2 = (Button) findViewById(R.id.ok2);

        //set the back button to go to a previous page
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //using Intent will to open a page
                Intent intent = new Intent(getApplicationContext(), ContinuePage.class);
                startActivity(intent);
                finish();
            }
        });

        //set the ok button to go to another page
        okButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Define the strings so that when user leaves a "Text box" empty
                //It will display an error message
                String firstTextFromUser = plateNo.getText().toString();
                String secondTextFromUser = makeOfCar.getText().toString();
                String thirdTextFromUser = colorOfCar.getText().toString();
                String fourthTextFromUser = paymentForFuel.getText().toString();

                //Make sure that user has filled all the details required
                //else they won't be able to move onto the next page
                if (TextUtils.isEmpty(firstTextFromUser)) {
                    plateNo.setError("Item cannot be empty");
                    Toast.makeText(getApplicationContext(), "Fill in the required session(s)", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(TextUtils.isEmpty(secondTextFromUser)) {
                    makeOfCar.setError("Item cannot be empty");
                    Toast.makeText(getApplicationContext(), "Fill in the required session(s)", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(TextUtils.isEmpty(thirdTextFromUser)){
                    colorOfCar.setError("Item cannot be empty");
                    Toast.makeText(getApplicationContext(), "Fill in the required session(s)", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(TextUtils.isEmpty(fourthTextFromUser)){
                    paymentForFuel.setError("Item cannot be empty");
                    Toast.makeText(getApplicationContext(), "Fill in the required session(s)", Toast.LENGTH_SHORT).show();
                    return;

                } else {
                    //using Intent will to open a page
                    Intent intent = new Intent(getApplicationContext(), MapPage.class);
                    startActivity(intent);
                    setContentView(R.layout.activity_map_page);
                }
            }
        });
    }
}