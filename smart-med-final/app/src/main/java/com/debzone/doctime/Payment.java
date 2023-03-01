package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Payment extends AppCompatActivity {
    Button ConfirmBtn;
    EditText phoneNo;
    EditText amountt;
    EditText rafname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        ConfirmBtn = findViewById(R.id.pay_button);

        phoneNo = findViewById(R.id.phone_number_edit_text);
        amountt = findViewById(R.id.amount_edit_text);
        rafname = findViewById(R.id.reference_edit_text);

        ConfirmBtn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    // Get input values
                    String phone = phoneNo.getText().toString();
                    String amount = amountt.getText().toString();
                    String rname = rafname.getText().toString();

                    if (phone.isEmpty()) {
                        phoneNo.setError("Phone is Required");
                        return;
                    }

                    if (amount.isEmpty() ) {
                        amountt.setError("Enter Amount");
                        return;
                    }
                    if (rname.isEmpty()) {
                        rafname.setError("Enter Your name");
                        return;
                    }

                    else {
                        Toast.makeText(Payment.this, "Please Fill all the info", Toast.LENGTH_SHORT).show();
                    }

                Intent intent = new Intent(Payment.this,SuccessPayment.class);
                startActivity(intent);
//                Toast.makeText(Payment.this, "Payment Successful", Toast.LENGTH_SHORT).show();
            }
        });
    }
}