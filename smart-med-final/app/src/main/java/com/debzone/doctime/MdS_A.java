package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MdS_A extends AppCompatActivity {

    private Button mdSAappoinmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_md_sa);

        mdSAappoinmentBtn = findViewById(R.id.mdSAappoinmentBtn1);
        mdSAappoinmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MdS_A.this,Payment.class);
                startActivity(intent);
            }
        });



    }
}