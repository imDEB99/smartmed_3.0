package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GnPhyC extends AppCompatActivity {

  private  Button gnPhyAappoinmentBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gn_phy_c);


        gnPhyAappoinmentBtn3 = findViewById(R.id.gnPhyAappointmentBtn3);

        gnPhyAappoinmentBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GnPhyC.this,Payment.class);
                startActivity(intent);
            }
        });
    }
}