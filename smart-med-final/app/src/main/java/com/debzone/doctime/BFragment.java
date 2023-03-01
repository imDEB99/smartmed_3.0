package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class BFragment extends Fragment {
    TextView DiagnosticCenter;
    TextView SignOut;
    CardView Popular;
    CardView Ibn;
    CardView United;
    CardView Comfort;
    CardView Mediaid;
    CardView Mothercare;


    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        Popular = view.findViewById(R.id.popularId);
        Popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),AmbulanceBooking.class);
                startActivity(intent);

            }
        });
        Ibn = view.findViewById(R.id.ibnId);
        Ibn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),AmbulanceBooking.class);
                startActivity(intent);

            }
        });
        United = view.findViewById(R.id.united);
        United.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),AmbulanceBooking.class);
                startActivity(intent);

            }
        });
        Comfort = view.findViewById(R.id.comfort);
        Comfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),AmbulanceBooking.class);
                startActivity(intent);

            }
        });
        Mediaid = view.findViewById(R.id.mediaid);
        Mediaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),AmbulanceBooking.class);
                startActivity(intent);

            }
        });
        Mothercare = view.findViewById(R.id.mothercare);
        Mothercare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),AmbulanceBooking.class);
                startActivity(intent);

            }
        });
//        SignOut = view.findViewById(R.id.signOutBtnFragmentB);
//        SignOut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(),Login.class);
//                startActivity(intent);
//            }
//        });

        return view;
    }
}