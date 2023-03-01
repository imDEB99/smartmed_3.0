package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class KidneySpecialist extends AppCompatActivity {

    private ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidney_specialist);

        imageView1 = findViewById(R.id.ks1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KidneySpecialist.this, KdS_A.class);
                startActivity(intent);
            }
        });

        imageView2 = findViewById(R.id.ks2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KidneySpecialist.this, KdS_B.class);
                startActivity(intent);
            }
        });
        imageView3 = findViewById(R.id.ks3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KidneySpecialist.this, KdS_C.class);
                startActivity(intent);
            }
        });
        imageView4 = findViewById(R.id.ks4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KidneySpecialist.this, KdS_D.class);
                startActivity(intent);

            }
        });
    }
}