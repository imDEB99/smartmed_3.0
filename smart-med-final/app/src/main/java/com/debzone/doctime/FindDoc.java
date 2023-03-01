package com.debzone.doctime;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.debzone.doctime.databinding.ActivityFindDocBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FindDoc extends AppCompatActivity {

    ActivityFindDocBinding binding;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       binding = ActivityFindDocBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());

       binding.finddocBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String doctype = binding.fieldId.getText().toString();
               if (!doctype.isEmpty()){
                   findDoc(doctype);

               }else{
                   Toast.makeText(FindDoc.this,"Please Enter Doctor Name",Toast.LENGTH_SHORT).show();
               }
           }
       });
    }

    private void findDoc(String doctype) {

        databaseReference = FirebaseDatabase.getInstance().getReference("Registered Doctors");
        databaseReference.child(doctype).get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {
                if (task.isSuccessful()){
                    if (task.getResult().exists()){
                        Toast.makeText(FindDoc.this,"Successfully Find",Toast.LENGTH_SHORT).show();
                        DataSnapshot dataSnapshot = task.getResult();
                        String Name = String.valueOf(dataSnapshot.child("name").getValue());
                        String Email = String.valueOf(dataSnapshot.child("email").getValue());
                        String Phone = String.valueOf(dataSnapshot.child("phone").getValue());
                        String Doctype = String.valueOf(dataSnapshot.child("doctype").getValue());
                        String DoctorCategory = String.valueOf(dataSnapshot.child("doccategory").getValue());


                        binding.fname.setText(Name);
                        binding.femail.setText(Email);
                        binding.fphone.setText(Phone);
                        binding.fdoc.setText(Doctype);
                        binding.fdocca.setText(DoctorCategory);


                    }else {
                        Toast.makeText(FindDoc.this,"Doctor Doesn't Exist ",Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(FindDoc.this,"Failed to show",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}