package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EyS_B extends AppCompatActivity {

    private Button eySAappoinmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ey_sb);

        eySAappoinmentBtn = findViewById(R.id.eySAappoinmentBtn2);
        eySAappoinmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EyS_B.this,Payment.class);
                startActivity(intent);
            }
        });
    }
}