package com.debzone.doctime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class VerifyEmail extends AppCompatActivity {

    TextView verifyMsg;
    Button verifyEmailBtn;
    FirebaseAuth firebaseAuth;
    FirebaseAuth firebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_email);

        firebaseAuth = FirebaseAuth.getInstance();


        verifyMsg = findViewById(R.id.verifyEmailMsgId);
        verifyEmailBtn = findViewById(R.id.VarifyBtnId);

        if (firebaseAuth.getCurrentUser().isEmailVerified()){
            verifyEmailBtn.setVisibility(View.VISIBLE);
            verifyMsg.setVisibility(View.VISIBLE);

        }

        verifyEmailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.getCurrentUser().sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {

                        Toast.makeText(VerifyEmail.this, "Verification Email Sent on your email", Toast.LENGTH_SHORT).show();



                        Intent intent = new Intent(VerifyEmail.this,Login.class);
                        startActivity(intent);
//                        verifyEmailBtn.setVisibility(View.GONE);
//                        verifyMsg.setVisibility(View.GONE);
//
                    }
                });
            }
        });


    }

}