//package com.debzone.doctime;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.ProgressDialog;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//
//public class Register extends AppCompatActivity {
//
//    EditText name, email, number, password;
//
//    Button signup;
//    TextView goToLogin;
//    FirebaseAuth firebaseAuth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_regi);
//
//        name = findViewById(R.id.fullName);
//        email = findViewById(R.id.emailAddress);
//        number = findViewById(R.id.phoneNumber);
//        password = findViewById(R.id.password);
//        goToLogin = findViewById(R.id.goToLoginActivity);
//
//
//        firebaseAuth = FirebaseAuth.getInstance();
//        ProgressDialog progressDialog = new ProgressDialog(this);
//
//         signup = findViewById(R.id.SignupBtn);
//
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String strName = name.getText().toString();
//                String strEmail = email.getText().toString();
//                String strNumber = number.getText().toString();
//                String strPassword = password.getText().toString();
//
//
//                boolean check =  ValeDateInfo(strName, strEmail, strNumber, strPassword);
//
//                if (check== true) {
//                    Toast.makeText(getApplicationContext(), "Data is valid", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(Register.this,VerifyEmail.class);
//                    startActivity(intent);
//                }
//                else {
//                    Toast.makeText(getApplicationContext(),"Sorry check the information again",Toast.LENGTH_SHORT).show();
//                }
//
//
//            }
//        });
//        goToLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Register.this, Login.class);
//                startActivity(intent);
//            }
//
//        });
//    }
//
//    private Boolean ValeDateInfo(String strName, String strEmail, String strNumber, String strPassword) {
//        if (strName.length() == 0) {
//            name.requestFocus();
//            name.setError("FIELD CANNOT BE EMPTY");
//            return false;
//        } else if (!strName.matches("^[a-zA-Z .]+$")) {
//            name.requestFocus();
//            name.setError("Enter only Alphabetical character");
//            return false;
//
//
//        } else if (strEmail.length() == 0) {
//            email.requestFocus();
//            email.setError("FIELD CANNOT BE EMPTY");
//            return false;
//
//        } else if (!strEmail.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")) {
//            email.requestFocus();
//            email.setError("FIELD CANNOT BE EMPTY");
//            return false;
//
//        } else if (strNumber.length() == 0) {
//            number.requestFocus();
//            number.setError("FIELD CANNOT BE EMPTY");
//            return false;
//
//        } else if (!strNumber.matches("(\\+88)?-?01[3-9]\\d{8}")) {
//            number.requestFocus();
//            number.setError("Correct Format: +8801**********");
//            return false;
//        }
//        else if (strPassword.length() < 8) {
//            password.requestFocus();
//            password.setError("FIELD Must  BE 8 character ");
//            return false;
//        }
//        else if (!strPassword.matches("(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%&*()]).{6,20}")) {
//            password.requestFocus();
//            password.setError("Password did not maintain the rules");
//            return false;
//        }
//
//
//        firebaseAuth.createUserWithEmailAndPassword(strEmail, strPassword)
//                .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            Toast.makeText(Register.this, "Successfully Signed up", Toast.LENGTH_SHORT).show();
//
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(Register.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//
//
//
//        return true;
//    }
//
//}



package com.debzone.doctime;

import android.app.ProgressDialog;
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
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    EditText name, email, number, password;

    Button signup;
    TextView goToLogin;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    public static DatabaseReference reference;
    public static DatabaseReference getref()
    {
        return reference;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regi);

        name = findViewById(R.id.pfullName);
        email = findViewById(R.id.pemailAddress);
        number = findViewById(R.id.pphoneNumber);
        password = findViewById(R.id.ppassword);
        goToLogin = findViewById(R.id.goToLoginActivity);


        firebaseAuth = FirebaseAuth.getInstance();
        ProgressDialog progressDialog = new ProgressDialog(this);

        signup = findViewById(R.id.pSignupBtn);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database = FirebaseDatabase.getInstance();
//                reference = database.getReference("Registered Patient");
                reference = database.getReference("Patient");

                String strName = name.getText().toString();
                String strEmail = email.getText().toString();
                String strNumber = number.getText().toString();
                String strPassword = password.getText().toString();

                HelperClass helperClass = new HelperClass(strName,strEmail,strNumber,strPassword);
                reference.child(strName).setValue(helperClass);


                boolean check =  ValeDateInfo(strName, strEmail, strNumber, strPassword);

                if (check== true) {
                    Toast.makeText(getApplicationContext(), "Data is valid", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register.this,VerifyEmail.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Sorry check the information again",Toast.LENGTH_SHORT).show();
                }


            }
        });
        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, Login.class);
                startActivity(intent);
            }

        });
    }

    private Boolean ValeDateInfo(String strName, String strEmail, String strNumber, String strPassword) {
        if (strName.length() == 0) {
            name.requestFocus();
            name.setError("FIELD CANNOT BE EMPTY");
            return false;
        } else if (!strName.matches("^[a-zA-Z .]+$")) {
            name.requestFocus();
            name.setError("Enter only Alphabetical character");
            return false;


        } else if (strEmail.length() == 0) {
            email.requestFocus();
            email.setError("FIELD CANNOT BE EMPTY");
            return false;

//        } else if (!strEmail.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")) {
//            email.requestFocus();
//            email.setError("FIELD CANNOT BE EMPTY");
//            return false;

        } else if (strNumber.length() == 0) {
            number.requestFocus();
            number.setError("FIELD CANNOT BE EMPTY");
            return false;

        } else if (!strNumber.matches("(\\+88)?-?01[3-9]\\d{8}")) {
            number.requestFocus();
            number.setError("Correct Format: +8801**********");
            return false;
        }
        else if (strPassword.length() < 8) {
            password.requestFocus();
            password.setError("FIELD Must  BE 8 character ");
            return false;
        }
        else if (!strPassword.matches("(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%&*()]).{6,20}")) {
            password.requestFocus();
            password.setError("Password did not maintain the rules");
            return false;
        }


        firebaseAuth.createUserWithEmailAndPassword(strEmail, strPassword)
                .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(Register.this, "Successfully Signed up", Toast.LENGTH_SHORT).show();

                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(Register.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });



        return true;
    }

}