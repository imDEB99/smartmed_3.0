package com.debzone.doctime;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DoctorListView extends AppCompatActivity {

    String docList[] = {"Apu","Rishad","Amio","Rafi","Sujoy","Showmik"};
    String docType[] = {"Cardiologist","Cardiologist","Cardiologist","Cardiologist","Cardiologist","Cardiologist"};
    String docDays[] = {"sat - mon","mon - sat","sun - mon","wed - sat","sat - wed","sat - wed"};
    String docTimes[] = {"2pm - 8pm","6pm - 9pm","8am - 11am","12pm - 2pm","10pm - 5am","2pm - 9pm"};

    int docImages[] = {R.drawable.app_icon,R.drawable.app_icon,R.drawable.app_icon,R.drawable.app_icon,R.drawable.app_icon,R.drawable.app_icon,};

    ListView listView;

    public DoctorListView(String s, String s1, String docDay, String docTime, int docImage) {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list_view);

        ArrayList<DoctorListView> DoctorListViewArrayList = new ArrayList<>();

        for(int i = 0; i<docImages.length; i++){

            DoctorListView doctorListView= new DoctorListView(docList[i],docType[i],docDays[i],docTimes[i],docImages[i]);
            DoctorListViewArrayList.add(doctorListView);
        }

        listView = (ListView) findViewById(R.id.docListView);
        DoctorBaseAdapter doctorBaseAdapter = new DoctorBaseAdapter(getApplicationContext(), this,DoctorListViewArrayList);
        listView.setAdapter(doctorBaseAdapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("DOC_LIST_VIEW", "Item is clicked @ position" +i);


            }
        });
    }



}