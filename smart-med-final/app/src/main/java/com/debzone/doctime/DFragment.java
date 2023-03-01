package com.debzone.doctime;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class DFragment extends Fragment {
    Button buyNow1;
    Button buyNow2;
    Button buyNow3;
    Button buyNow4;
    Button buyNow5;
    Button buyNow6;
    Button buyNow7;
    Button buyNow8;
    Button buyNow9;
    Button buyNow10;
    Button buyNow11;
    Button buyNow12;
    Button buyNow13;
    Button buyNow14;
    Button buyNow15;

    public DFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_d, container, false);

        buyNow1 = view.findViewById(R.id.buy_button_sergel);
        buyNow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quantity.class);
                startActivity(intent);
            }
        });
        buyNow2 = view.findViewById(R.id.buy_button_napa);
        buyNow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quantiry_B.class);
                startActivity(intent);
            }
        });
        buyNow3 = view.findViewById(R.id.buy_button_hygenix);
        buyNow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quantity_C.class);
                startActivity(intent);
            }
        });
        buyNow4 = view.findViewById(R.id.buy_button_mumps);
        buyNow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quantity_D.class);
                startActivity(intent);
            }
        });
        buyNow5 = view.findViewById(R.id.buy_button_omidon);
        buyNow5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quantity_E.class);
                startActivity(intent);
            }
        });
//        buyNow6 = view.findViewById(R.id.buy_button_tufnil);
//        buyNow6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), Quantity_F.class);
//                startActivity(intent);
//            }
//        });
//        buyNow7 = view.findViewById(R.id.buy_button_);
//        buyNow7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), Quantity_G.class);
//                startActivity(intent);
//            }
//        });
//        buyNow8 = view.findViewById(R.id.buy_button_tufnil);
//        buyNow8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), Quantity_H.class);
//                startActivity(intent);
//            }
//        });
//        buyNow9 = view.findViewById(R.id.buy_button_);
//        buyNow9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), Quantity_I.class);
//                startActivity(intent);
//            }
//        });
//        buyNow10 = view.findViewById(R.id.buy_button_);
//        buyNow10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), Quantity_F.class);
//                startActivity(intent);
//            }
//        });




        return view;
    }
}