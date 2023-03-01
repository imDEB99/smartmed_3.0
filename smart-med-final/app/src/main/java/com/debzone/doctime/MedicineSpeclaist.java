package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MedicineSpeclaist extends AppCompatActivity {

    private ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_speclaist);


        imageView1 = findViewById(R.id.md1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MedicineSpeclaist.this,MdS_A.class);
                startActivity(intent);
            }
        });

        imageView2 = findViewById(R.id.md2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedicineSpeclaist.this,MdS_B.class);
                startActivity(intent);
            }
        });
        imageView3 = findViewById(R.id.md3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedicineSpeclaist.this,MdS_C.class);
                startActivity(intent);
            }
        });
//        imageView4 = findViewById(R.id.md4);
//        imageView4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MedicineSpeclaist.this,MdS_D.class);
//                startActivity(intent);
//
//            }
//        });


    }
}