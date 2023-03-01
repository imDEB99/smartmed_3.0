package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GnPhyA extends AppCompatActivity {

     private Button gnPhyAappoinmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gn_phy);

        gnPhyAappoinmentBtn = findViewById(R.id.gnPhyAappointmentBtn1);

        gnPhyAappoinmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GnPhyA.this,Payment.class);
                startActivity(intent);
            }
        });


    }
}