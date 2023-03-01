package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AmbulanceBooking extends AppCompatActivity {
    EditText nameEditText, addressEditText, phoneEditText, dateEditText, timeEditText;
    Button bookButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance_booking);

        nameEditText = findViewById(R.id.nameEditText);
        addressEditText = findViewById(R.id.addressEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        dateEditText = findViewById(R.id.dateEditText);
        timeEditText = findViewById(R.id.timeEditText);
        bookButton = findViewById(R.id.bookButton);

        // Set button click listener
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get input values
                String name = nameEditText.getText().toString();
                String address = addressEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                String date = dateEditText.getText().toString();
                String time = timeEditText.getText().toString();

                if (name.isEmpty()) {
                    nameEditText.setError("Name is Required");
                    return;
                }

                if (address.isEmpty()) {
                    addressEditText.setError("Address is Required");
                    return;
                }
                if (phone.length() < 11) {
                    phoneEditText.setError("Phone must be 11 Character");
                    return;
                }
                if (date.isEmpty()) {
                    dateEditText.setError("Enter Date");
                    return;
                }
                if (time.isEmpty()) {
                    timeEditText.setError("Password must be 8 Character");
                    return;
                }
                else {
                    Toast.makeText(AmbulanceBooking.this, "Please Fill all the info", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(AmbulanceBooking.this, Payment.class);
                startActivity(intent);
            }
        });


    }
}
