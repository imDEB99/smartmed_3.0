package com.debzone.doctime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DoctorBaseAdapter extends BaseAdapter {

    Context context;
    String ListDoctor[];
    String ListDocType[];
    String ListDocTime[];
    String ListDocDays[];
    int ListImages[];
    LayoutInflater layoutInflater;

    public DoctorBaseAdapter(String[] listDoctor, String[] listDocType, String[] listDocTime, String[] listDocDays, int[] listImages, LayoutInflater layoutInflater) {
        ListDoctor = listDoctor;
        ListDocType = listDocType;
        ListDocTime = listDocTime;
        ListDocDays = listDocDays;
        ListImages = listImages;
        this.layoutInflater = layoutInflater;
    }

    public DoctorBaseAdapter(Context ctx, String[] docList, int[] docImages) {
    }

    public DoctorBaseAdapter(Context applicationContext, DoctorListView doctorListView, ArrayList<DoctorListView> doctorListViewArrayList) {
    }


    @Override
    public int getCount() {
        return ListDoctor.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }


    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        convertView = layoutInflater.inflate(R.layout.activity_custom_list_view,null);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ImageIcon);
        textView.setText(ListDoctor[position]);
        textView.setText(ListDocType[position]);
        textView.setText(ListDocTime[position]);
        textView.setText(ListDocDays[position]);
        imageView.setImageResource(ListImages[position]);
        return convertView;
    }
}
