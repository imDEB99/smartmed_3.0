package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class EFragment extends Fragment {

    private Button Ac,Nocac;



    public EFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_e, container, false);

        Ac = view.findViewById(R.id.ac);
        Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AcAmbulance.class);
                startActivity(intent);
            }

        });
        Nocac = view.findViewById(R.id.nonac);
        Nocac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),NoAcAmbulance.class);
                startActivity(intent);
            }
        });

        return view;
    }
}