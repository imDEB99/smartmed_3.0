package com.debzone.doctime;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessPayment extends AppCompatActivity {


    Button VideoConsultation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_payment);

        Toast.makeText(this, "We will notify you soon through your phone number. Thank you!", Toast.LENGTH_SHORT).show();

//        VideoConsultation = findViewById(R.id.videoConsultentBtn);
//        VideoConsultation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SuccessPayment.this, VideoCall.class);
//                startActivity(intent);
//            }
//
//        });
    }
}