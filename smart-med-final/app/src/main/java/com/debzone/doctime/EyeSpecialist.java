package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EyeSpecialist extends AppCompatActivity {

    private ImageView imageView1,imageView2,imageView3,imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_specialist);

        imageView1 = findViewById(R.id.es1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EyeSpecialist.this,EyS_A.class);
                startActivity(intent);
            }
        });

        imageView2 = findViewById(R.id.es2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EyeSpecialist.this,EyS_B.class);
                startActivity(intent);
            }
        });
        imageView3 = findViewById(R.id.es3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EyeSpecialist.this,EyS_C.class);
                startActivity(intent);
            }
        });

    }
}