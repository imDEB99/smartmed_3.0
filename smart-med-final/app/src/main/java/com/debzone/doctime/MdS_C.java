package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MdS_C extends AppCompatActivity {

        private Button mdSAappoinmentBtn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_md_sc);

            mdSAappoinmentBtn = findViewById(R.id.htSAappoinmentBtn3);
            mdSAappoinmentBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MdS_C.this,Payment.class);
                    startActivity(intent);
                }
            });
    }
}