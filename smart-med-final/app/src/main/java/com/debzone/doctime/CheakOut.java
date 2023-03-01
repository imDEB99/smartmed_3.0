package com.debzone.doctime;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class CheakOut extends AppCompatActivity {
    private EditText fullNameEditText;
    private EditText emailEditText;
    private EditText phoneNumberEditText;
    private RadioButton creditCardRadioButton;
    private RadioButton paypalRadioButton;
    private Button purchaseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheak_out);


        fullNameEditText = findViewById(R.id.full_name_edit_text);
        emailEditText = findViewById(R.id.email_edit_text);
        phoneNumberEditText = findViewById(R.id.phone_number_edit_text);
        creditCardRadioButton = findViewById(R.id.credit_card_radio_button);
        paypalRadioButton = findViewById(R.id.paypal_radio_button);
        purchaseButton = findViewById(R.id.purchase_button);


        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get user input from UI components
                String fullName = fullNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String phoneNumber = phoneNumberEditText.getText().toString();
                String paymentMethod;
                if (creditCardRadioButton.isChecked()) {
                    paymentMethod = "Credit Card";
                } else {
                    paymentMethod = "PayPal";

                }
            }
        });

    }
}
