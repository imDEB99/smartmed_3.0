package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class KdS_D extends AppCompatActivity {

    private Button kSAappoinmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kd_sd);

        kSAappoinmentBtn = findViewById(R.id.kdSAappoinmentBtn4);
        kSAappoinmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KdS_D.this,Payment.class);
                startActivity(intent);
            }
        });
    }
}