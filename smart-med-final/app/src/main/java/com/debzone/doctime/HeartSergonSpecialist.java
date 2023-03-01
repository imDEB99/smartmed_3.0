package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HeartSergonSpecialist extends AppCompatActivity {

    private ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_sergon_specialist);

        imageView1 = findViewById(R.id.hs1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HeartSergonSpecialist.this,HtS_A.class);
                startActivity(intent);
            }
        });

        imageView2 = findViewById(R.id.hs2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeartSergonSpecialist.this,HtS_B.class);
                startActivity(intent);
            }
        });
        imageView3 = findViewById(R.id.hs3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeartSergonSpecialist.this,HtS_C.class);
                startActivity(intent);
            }
        });
//        imageView4 = findViewById(R.id.hs4);
//        imageView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(HeartSergonSpecialist.this,HtS_D.class);
//                startActivity(intent);
//
//            }
//        });

    }
}