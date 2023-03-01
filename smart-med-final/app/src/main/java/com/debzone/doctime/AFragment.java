package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class AFragment extends Fragment {


    public AFragment() {
        // Required empty public constructor
    }

    CardView GenaralPhysician;
    CardView MedicineSpecialist;
    CardView HeartSergonSpecialist;
    CardView EyeSpecialist;
    CardView ChildSpecialist;
    CardView KidneySpecialist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a, container, false);

        GenaralPhysician = view.findViewById(R.id.generalBtn);
        GenaralPhysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), GeneralPhysiciansList.class);
                startActivity(intent);
            }

        });
        MedicineSpecialist = view.findViewById(R.id.medicineSpeclalistId);
        MedicineSpecialist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),MedicineSpeclaist.class);
                startActivity(intent);
            }
        });
        HeartSergonSpecialist = view.findViewById(R.id.heartspeacialistId);
        HeartSergonSpecialist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),HeartSergonSpecialist.class);
                startActivity(intent);
            }
        });
        EyeSpecialist = view.findViewById(R.id.eyeSpecialist);
        EyeSpecialist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),EyeSpecialist.class);
                startActivity(intent);
            }
        });
        ChildSpecialist = view.findViewById(R.id.childSpecialistId);
        ChildSpecialist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),ChildSpecialist.class);
                startActivity(intent);
            }
        });
        KidneySpecialist = view.findViewById(R.id.kidneySpecialist);
        KidneySpecialist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),KidneySpecialist.class);
                startActivity(intent);
            }
        });

//        SignOut = view.findViewById(R.id.signOutBtnFragmentA);
//        SignOut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(),Login.class);
//                startActivity(intent);
//            }
//
//        });
//        SearchBtn = view.findViewById(R.id.searchBtn);
//        SearchBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(),VideoCall.class);
//                startActivity(intent);
//            }
//
//        });
//        SearchBtn = view.findViewById(R.id.searchBtn);
//
//       SearchBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(),FindDoc.class);
//                startActivity(intent);
//            }
//
//        });
//        VedioCall = view.findViewById(R.id.vedioCallBtn);
//        VedioCall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(), VideoCall.class);
//                startActivity(intent);
//            }
//        });
        return view;
    }


}