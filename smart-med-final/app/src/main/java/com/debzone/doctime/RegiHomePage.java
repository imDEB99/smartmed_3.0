package com.debzone.doctime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;

public class RegiHomePage extends AppCompatActivity {
    Button doctorjoin;
    Button patientjoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regi_home_page);

        doctorjoin = findViewById(R.id.doctorJoinBtnId);
        patientjoin = findViewById(R.id.patientJoinBtnId);

        doctorjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegiHomePage.this, DoctorRegister.class);
                startActivity(intent);
            }
        });

        patientjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegiHomePage.this, Register.class);
                startActivity(intent);
            }
        });

    }
}
