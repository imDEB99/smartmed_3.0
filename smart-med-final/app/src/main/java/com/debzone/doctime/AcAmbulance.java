package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AcAmbulance extends AppCompatActivity {

    Button Acbtn1;
    Button Acbtn2;
    Button Acbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_ambulance);

        Acbtn1 = findViewById(R.id.acbtn1);
        Acbtn2 = findViewById(R.id.acbtn2);
        Acbtn3 = findViewById(R.id.acbtn3);


        Acbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcAmbulance.this,QuantityAmbulance.class);
                startActivity(intent);

            }
        });
        Acbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcAmbulance.this,QuantityAmbulance.class);
                startActivity(intent);

            }
        });
        Acbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcAmbulance.this,QuantityAmbulance.class);
                startActivity(intent);

            }
        });


    }
}