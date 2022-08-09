package com.example.fueldeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is the FIFTH PAGE of the FuelDeliveryApp.
 *
 * It focuses on the user making payments.
 */

public class CardPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_payment);

        //Define the Confirm button
        final Button confirm = (Button) findViewById(R.id.paymentConfirmation);

        //Define the text the user will type
        final EditText cardNo = (EditText) findViewById(R.id.cardNumberText);
        final EditText dateCardNo = (EditText) findViewById(R.id.dateText);
        final EditText cvvCardNo = (EditText) findViewById(R.id.cvvText);
        final EditText postalCodeNo = (EditText) findViewById(R.id.postalText);
        final EditText MobileNum = (EditText) findViewById(R.id.MobileNoText);

        //Once Confirm button is clicked payment is made.
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Define the strings so that when user leaves a "Text box" empty
                //It will display an error message
                String cardNumDetails = cardNo.getText().toString();
                String dateDetails = dateCardNo.getText().toString();
                String cvvDetails = cvvCardNo.getText().toString();
                String postalCodeDetails = postalCodeNo.getText().toString();
                String MobileNoDetails = MobileNum.getText().toString();

                //If the details to be entered is empty or doesn't start with '4'
                if(TextUtils.isEmpty(cardNumDetails) || !cardNumDetails.startsWith("4")){
                    cardNo.setError("Error: item is empty or incorrect details given."); //error message
                }
                else if(TextUtils.isEmpty(dateDetails)){
                    dateCardNo.setError("Item is empty"); //error message
                }
                else if(TextUtils.isEmpty(cvvDetails)){
                    cvvCardNo.setError("Item is empty"); //error message
                }
                else if(TextUtils.isEmpty(postalCodeDetails)){
                    postalCodeNo.setError("Item is empty"); //error message
                }
                else if(TextUtils.isEmpty(MobileNoDetails)){
                    MobileNum.setError("Item is empty"); //error message
                }else{
                    //using Intent will to open a page
                    Intent intent = new Intent(getApplicationContext(), LoadingPage.class);
                    startActivity(intent);
                    setContentView(R.layout.activity_loading_page);
                }
            }
        });
    }
}