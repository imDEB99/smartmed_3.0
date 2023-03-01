//package com.debzone.doctime;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.storage.FirebaseStorage;
//
//
//public class StoreFragment extends Fragment {
//    Button svbtn;
//    FirebaseStorage db;
//
//    public StoreFragment() {
//        // Required empty public constructor
//    }
//
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_store, container, false);
//         DatabaseReference mDatabase;
//// ...
//        mDatabase = FirebaseDatabase.getInstance().getReference();
//
//        return view;
//    }
//}