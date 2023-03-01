package com.debzone.doctime;

import static com.debzone.doctime.R.id.DocSignupBtn;

import android.annotation.SuppressLint;
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

public class DoctorRegister extends AppCompatActivity{

    EditText name,email,number,doctype,doccategory,bm_dc_regi_no,password;

    Button DocSignUp;
    TextView goToLogin;
    FirebaseAuth firebaseAuth;

    public static DatabaseReference reference;
    FirebaseDatabase database;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_register);

        name = findViewById(R.id.fullName);
        email = findViewById(R.id.emailAddress);
        number = findViewById(R.id.phoneNumber);
        doctype = findViewById(R.id.doctorType);
        doccategory = findViewById(R.id.doctorCategory);
//        Spinner spinner = findViewById(R.id.spinner);
        bm_dc_regi_no = findViewById(R.id.doctorIdNo);
        password = findViewById(R.id.password);



        goToLogin = findViewById(R.id.goToLoginActivity);


        firebaseAuth = FirebaseAuth.getInstance();
        ProgressDialog progressDialog = new ProgressDialog(this);

        DocSignUp = findViewById(DocSignupBtn);

        DocSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("Registered Doctors");

                String strName = name.getText().toString();
                String strEmail = email.getText().toString();
                String strNumber = number.getText().toString();
                String strDocType = doctype.getText().toString();
                String strDocCategory = doccategory.getText().toString();
                String strBmDcNo = bm_dc_regi_no.getText().toString();
                String strPassword = password.getText().toString();

                Toast.makeText(DoctorRegister.this, "User name is: "+strName, Toast.LENGTH_SHORT).show();

                HelperClassDoctor helperClassDoctor = new HelperClassDoctor(strName,strEmail,strNumber,strPassword,strDocType,strDocCategory,strBmDcNo);
                reference.child(strName).setValue(helperClassDoctor);



                boolean check =  ValeDateInfo(strName, strEmail, strNumber,strDocType, strDocCategory, strBmDcNo, strPassword);

                if (check== true) {
                    Toast.makeText(getApplicationContext(), "Data is valid", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(DoctorRegister.this,VerifyEmail.class);
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
                Intent intent = new Intent(DoctorRegister.this, Login.class);
                startActivity(intent);
            }

        });
    }

    private Boolean ValeDateInfo(String strName, String strEmail, String strNumber,String strDocType,String strDocCategory,String strBmDcNo, String strPassword) {
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

        } else if (!strEmail.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")) {
            email.requestFocus();
            email.setError("FIELD CANNOT BE EMPTY");
            return false;

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
                .addOnCompleteListener(DoctorRegister.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(DoctorRegister.this, "Successfully Signed up", Toast.LENGTH_SHORT).show();

                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(DoctorRegister.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });



        return true;
    }

}