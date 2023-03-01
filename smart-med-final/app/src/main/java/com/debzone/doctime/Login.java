//package com.debzone.doctime;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.debzone.doctime.databinding.ActivityLoginBinding;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.OnFailureListener;
//import com.google.android.gms.tasks.OnSuccessListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//
//public class Login extends AppCompatActivity {
//
//    EditText emailAddressId;
//    EditText passwordId;
//    Button LoginBtn;
//    TextView ForgetPasswordBtn;
//    TextView goToSingUp;
//
//    FirebaseAuth firebaseAuth;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//
//        firebaseAuth = FirebaseAuth.getInstance();
//
//        emailAddressId = findViewById(R.id.emailAddressId);
//        passwordId = findViewById(R.id.passwordId);
//
//        LoginBtn = findViewById(R.id.loginBtn);
//        ForgetPasswordBtn = findViewById(R.id.forgetPasswordId);
//        goToSingUp = findViewById(R.id.goToRegisterActivity);
//
//        LoginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                 String strEmail = emailAddressId.getText().toString();
//                 String strPassword = passwordId.getText().toString();
//
//                if(strEmail.isEmpty()){
//                    emailAddressId.setError("Full Name is Required");
//                    return;
//                }
//
//                if(strPassword.isEmpty()){
//                    passwordId.setError("Password is Required");
//                    return;
//                }
//                if(strPassword.length() < 8){
//                    passwordId.setError("Password must be 8 Character");
//                    return;
//                }
//
//
//            firebaseAuth.signInWithEmailAndPassword(strEmail,strPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if (task.isSuccessful()) {
//                        // Sign in success, update UI with the signed-in user's information
//                        //Toast.makeText(Login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
//                        FirebaseUser user = firebaseAuth.getCurrentUser();
//
//                        boolean ismailverified = user.isEmailVerified();
//
//                        if(ismailverified)
//                        {
//                            Intent intent = new Intent(Login.this, Nevigation.class);
//                            startActivity(intent);
//                            Toast.makeText(Login.this, "LogIn Successfull", Toast.LENGTH_SHORT).show();
//                        }
//                        else
//                        {
//                            Toast.makeText(Login.this, "Your Email is not verified./nPlease verify your email first.", Toast.LENGTH_SHORT).show();
//                        }
//
//
//
//
//                    } else {
//                        // If sign in fails, display a message to the user.
////                        Log.w(TAG, "signInWithEmail:failure", task.getException());
//                        Toast.makeText(Login.this, "Authentication failed."+task.getException().toString(), Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//                }
//
//        });
//
//
//        ForgetPasswordBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               String strEmail = emailAddressId.getText().toString();
//
//               firebaseAuth.sendPasswordResetEmail(strEmail).addOnSuccessListener(new OnSuccessListener<Void>() {
//                   @Override
//                   public void onSuccess(Void unused) {
//                       Toast.makeText(Login.this,"Email send",Toast.LENGTH_SHORT).show();
//                   }
//               })
//                       .addOnFailureListener(new OnFailureListener() {
//                           @Override
//                           public void onFailure(@NonNull Exception e) {
//                               Toast.makeText(Login.this,"Something worng",Toast.LENGTH_SHORT).show();
//                           }
//                       });
//
//            }
//        });
//
//
//         goToSingUp.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(Login.this, RegiHomePage.class);
//                    startActivity(intent);
//                }
//
//        });
//
//    }
//
package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class Login extends AppCompatActivity {

    EditText emailAddressId;
    EditText passwordId;
    Button LoginBtn;
    TextView ForgetPasswordBtn;
    TextView goToSingUp;
    Boolean passwordvisible;

    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        firebaseAuth = FirebaseAuth.getInstance();

        emailAddressId = findViewById(R.id.emailAddressId);
        passwordId = findViewById(R.id.passwordId);

        LoginBtn = findViewById(R.id.loginBtn);
        ForgetPasswordBtn = findViewById(R.id.forgetPasswordId);

        goToSingUp = findViewById(R.id.goToRegisterActivity);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String strEmail = emailAddressId.getText().toString();
                String strPassword = passwordId.getText().toString();


                if (strEmail.isEmpty()) {
                    emailAddressId.setError("Email is Required");
                    return;
                }

                if (strPassword.isEmpty()) {
                    passwordId.setError("Password is Required");
                    return;
                }
                if (strPassword.length() < 8) {
                    passwordId.setError("Password must be 8 Character");
                    return;
                }

                if (validateUseremail() | validatePassword()) {

                } else {
                    checkUser();
                }


                firebaseAuth.signInWithEmailAndPassword(strEmail, strPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            //Toast.makeText(Login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                            FirebaseUser user = firebaseAuth.getCurrentUser();

                            boolean ismailverified = user.isEmailVerified();

                            if (ismailverified) {
                                Intent intent = new Intent(Login.this, Nevigation.class);
                                startActivity(intent);
                                Toast.makeText(Login.this, "LogIn Successfull", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(Login.this, "Your Email is not verified./nPlease verify your email first.", Toast.LENGTH_SHORT).show();
                            }

                        } else {
                            // If sign in fails, display a message to the user.
//                        Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(Login.this, "Authentication failed." + task.getException().toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }

        });


        ForgetPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strEmail = emailAddressId.getText().toString();

                firebaseAuth.sendPasswordResetEmail(strEmail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Login.this, "Email send", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Login.this, "Something worng", Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });


        goToSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, RegiHomePage.class);
                startActivity(intent);
            }

        });

    }

    public Boolean validateUseremail() {
        String val = emailAddressId.getText().toString();
        if (val.isEmpty()) {
            emailAddressId.setError("Email Can't be empty");
            return false;
        } else {
            emailAddressId.setError(null);
            return true;
        }
    }


    public Boolean validatePassword() {
        String val = passwordId.getText().toString();
        if (val.isEmpty()) {
            passwordId.setError("Email Can't be empty");
            return false;
        } else {
            passwordId.setError(null);
            return true;
        }
    }


    public void checkUser() {
        String strEmail = emailAddressId.getText().toString();
        String strPassword = passwordId.getText().toString();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkUserDatabase = reference.orderByChild("useremail").equalTo(strEmail);

        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    emailAddressId.setError(null);
                    String passwordFromDB = snapshot.child(strEmail).child("password").getValue(String.class);

                    if (!Objects.equals(passwordFromDB, strPassword)) {
                        emailAddressId.setError(null);
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        passwordId.setError("Invalid Credentials");
                        passwordId.requestFocus();
                    }
//                    else{
//                        emailAddressId.setError("User does not exist");
//                        emailAddressId.requestFocus();
//                    }

                }

            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}
