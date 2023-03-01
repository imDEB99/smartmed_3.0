//package com.debzone.doctime;
//
//import android.os.Bundle;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.bumptech.glide.Glide;
//
//public class DetailsActivity extends AppCompatActivity {
//
//    TextView detailDesc, detailTitle;
//    ImageView detailImage;
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_details);
//
//
//        detailDesc = findViewById(R.id.detailDesc);
//        detailTitle = findViewById(R.id.detailTitle);
//        detailImage = findViewById(R.id.detailImage);
//
//
//        Bundle bundle = getIntent().getExtras();
//        if (bundle!= null){
//            detailDesc.setText(bundle.getString("Description"));
//            detailTitle.setText(bundle.getString("Title"));
//            Glide.with(this).load(bundle.getString("Image")).into(detailImage);
//        }
//    }
//}