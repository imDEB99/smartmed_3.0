package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChS_A extends AppCompatActivity {

    private Button cSAappoinmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_sa);

        cSAappoinmentBtn = findViewById(R.id.chSAappoinmentBtn1);
        cSAappoinmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChS_A.this,Payment.class);
                startActivity(intent);
            }
        });

    }
}