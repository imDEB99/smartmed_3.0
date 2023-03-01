package com.debzone.doctime;

import static com.debzone.doctime.R.string.close;
import static com.debzone.doctime.R.string.start;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class Nevigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bnView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    MenuItem item;
    HelperClass post;
    FirebaseDatabase database;
    public static DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nevigation);

        bnView = findViewById(R.id.bnViwe);
        loadFrag(new CFragment(), true);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationview);


        toggle = new ActionBarDrawerToggle(this,drawerLayout, start, close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);

//      bnView.setOnApplyWindowInsetsListener(new BottomNavigationView.OnNavigationItemSelectedListener());\
        bnView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id==R.id.nav_doctor){

                    loadFrag(new AFragment(),false);

                }else if (id==R.id.nav_diagnostic){
                    loadFrag(new BFragment(),false);

                }else if (id==R.id.nav_medicine){
                    loadFrag(new DFragment(),false);

                }else if (id==R.id.nav_manu){
                    //profile ke liya
                    loadFrag(new EFragment(),false);
                }

                return  true;
            }


        });
        bnView.setSelectedItemId(R.id.nav_doctor);


    }

    private boolean onOptionsItemSelected() {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }

    public void loadFrag(Fragment fragment,boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();


        if(flag)
             ft.add(R.id.container,new AFragment());
        else
            ft.replace(R.id.container, fragment);
        ft.commit();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("Registered Patient");

        switch (item.getItemId()){
//            case R.id.nav_profile:
//                ValueEventListener postListener = new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        // Get Post object and use the values to update the UI
//                        post = dataSnapshot.getValue(HelperClass.class);
//                        Toast.makeText(Nevigation.this, "Hk", Toast.LENGTH_SHORT).show();
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//                        // Getting Post failed, log a message
//                        Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
//                    }
//                };
//                reference.addValueEventListener(postListener);
//                break;

            case R.id.nav_profile:
                Intent intent1= new Intent(Nevigation.this,UserProfile.class);
                startActivity(intent1);
                break;


            case R.id.nav_share:
                Intent intent2 = new Intent(Intent.ACTION_PICK);
                try{
                    intent2.setType("text/plain");
                    intent2.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                    startActivity(Intent.createChooser(intent2,"Shere with"));
                    Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(this,"Unable to share this app",Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.nav_termsandcondition:
                Toast.makeText(this, "Terms and Condition", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_pricvacypolicy:
                Toast.makeText(this, "Privacy Policy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_aboutus:
                Intent intent4 = new Intent(Nevigation.this,AboutUs.class);
                startActivity(intent4);
                Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_contactus:
                Intent intent5 = new Intent(Nevigation.this,ContactUs.class);
                startActivity(intent5);
                Toast.makeText(this, "Contact Us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_logout:
                ClickLogout(this);
                Intent intent = new Intent(Nevigation.this, MainActivity.class);
                startActivity(intent);
                break;

        }

        return true;

    }

    private void ClickLogout(Nevigation nevigation) {
    }

    public void ClickLogout(View view){
        
        
     }


}