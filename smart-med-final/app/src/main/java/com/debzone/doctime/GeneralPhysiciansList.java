package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class GeneralPhysiciansList extends AppCompatActivity {

    private  ImageView imageView1,imageView2,imageView3,imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_physicians_list);

        imageView1 = findViewById(R.id.gn1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GeneralPhysiciansList.this,GnPhyA.class);
                startActivity(intent);
            }
        });
        imageView2 = findViewById(R.id.gn2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GeneralPhysiciansList.this,GnPhyB.class);
                startActivity(intent);
            }
        });
        imageView3 = findViewById(R.id.gn3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GeneralPhysiciansList.this,GnPhyC.class);
                startActivity(intent);
            }
        });
        imageView4 = findViewById(R.id.gn4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GeneralPhysiciansList.this,GnPhyD.class);
                startActivity(intent);
            }
        });


    }
}