package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NoAcAmbulance extends AppCompatActivity {

    Button Nonbtn1;
    Button Nonbtn2;
    Button Noncbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_ac_ambulance);

        Nonbtn1 = findViewById(R.id.Nonac1);
        Nonbtn2 = findViewById(R.id.Nonac2);
        Noncbtn3 = findViewById(R.id.Nonac3);


        Nonbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NoAcAmbulance.this,QuantityAmbulance.class);
                startActivity(intent);

            }
        });
        Nonbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NoAcAmbulance.this,QuantityAmbulance.class);
                startActivity(intent);

            }
        });
        Noncbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NoAcAmbulance.this,QuantityAmbulance.class);
                startActivity(intent);

            }
        });


    }
}