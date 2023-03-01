package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserProfile extends AppCompatActivity {
    private FirebaseUser user;
    FirebaseAuth firebaseAuth;
    private DatabaseReference reference;
    private String userID;
    private Button Logout;
    TextView ProfileName,ProfileEmail,ProfilePhone;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Logout = (Button) findViewById(R.id.logoutProfile);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              firebaseAuth =  FirebaseAuth.getInstance();
                Intent intent = new Intent(UserProfile.this, Login.class);
                startActivity(intent);
            }
        });


    user = FirebaseAuth.getInstance().getCurrentUser();
    reference = FirebaseDatabase.getInstance().getReference("Patient");
    userID = user.getUid();

//        TextView textView = (TextView) findViewById(R.id.nameProfileId);
        ProfileName = findViewById(R.id.nameProfileId);
        ProfileEmail = findViewById(R.id.emailProfileId);
        ProfilePhone = findViewById(R.id.phoneProfileId);


        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                user userProfile = snapshot.getValue(user.class);
                if (userProfile != null){
                    String name = userProfile.name;
                    String email = userProfile.email;
                    String phone = userProfile.phone;

                    ProfileName.setText("Welcome"+name+"!");
                    ProfileEmail.setText(email);
                    ProfilePhone.setText(phone);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(UserProfile.this,"Something wrong happend!",Toast.LENGTH_LONG).show();
            }
        });


    }
}