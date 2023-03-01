package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChS_D extends AppCompatActivity {

    private Button cSAappoinmentBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_sd);

        cSAappoinmentBtn = findViewById(R.id.chSAappoinmentBtn4);
        cSAappoinmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChS_D.this,Payment.class);
                startActivity(intent);
            }
        });
    }
}