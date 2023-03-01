package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GnPhyB extends AppCompatActivity {

    private Button  gnPhyAappoinmentBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gn_phy_b);


        gnPhyAappoinmentBtn2 = findViewById(R.id.gnPhyAappointmentBtn2);

        gnPhyAappoinmentBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GnPhyB.this,Payment.class);
                startActivity(intent);
            }
        });


    }
}