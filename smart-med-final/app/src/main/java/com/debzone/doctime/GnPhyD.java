package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GnPhyD extends AppCompatActivity {
    private Button gnPhyAappoinmentBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gn_phy_d);

        gnPhyAappoinmentBtn4 = findViewById(R.id.gnPhyAappointmentBtn4);

        gnPhyAappoinmentBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GnPhyD.this,Payment.class);
                startActivity(intent);
            }
        });
    }
}