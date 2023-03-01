package com.debzone.doctime;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Quantity_D extends AppCompatActivity {

    private int quantity = 1; // Default quantity is 1



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantity_d);

        Button quantityDecrease = findViewById(R.id.quantity_decrease);
        Button quantityIncrease = findViewById(R.id.quantity_increase);
        TextView quantityValue = findViewById(R.id.quantity_value);
        Button buyNowButton = findViewById(R.id.buy_now_button_Qn);


        quantityDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity > 1) {
                    quantity--;
                    quantityValue.setText(String.valueOf(quantity));
                }
            }
        });

        quantityIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity++;
                quantityValue.setText(String.valueOf(quantity));
            }
        });


        buyNowButton = findViewById(R.id.buy_now_button_Qn);
        buyNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int quantity = Integer.parseInt(quantityValue.getText().toString());

                // Calculate the total price based on the quantity and per price
                int perPrice = 16; // Per price in taka
                int totalPrice = perPrice * quantity;

                // Show a dialog to confirm the purchase
                AlertDialog.Builder builder = new AlertDialog.Builder(Quantity_D.this);
                builder.setTitle("Confirm Purchase");
                builder.setMessage("Are you sure you want to purchase " + quantity + " items for a total of " + totalPrice + " taka?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Quantity_D.this, Payment.class);
                        startActivity(intent);

                    }
                });
                builder.setNegativeButton("No", null);
                builder.show();


            }
        });
    }
}