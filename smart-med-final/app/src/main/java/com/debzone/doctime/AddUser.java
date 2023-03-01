//package com.debzone.doctime;
//
//        import androidx.annotation.NonNull;
//        import androidx.appcompat.app.AppCompatActivity;
//        import androidx.recyclerview.widget.LinearLayoutManager;
//        import androidx.recyclerview.widget.RecyclerView;
//
//        import android.app.Dialog;
//        import android.content.Context;
//        import android.graphics.Color;
//        import android.graphics.drawable.ColorDrawable;
//        import android.os.Bundle;
//        import android.view.View;
//        import android.view.Window;
//        import android.widget.Button;
//        import android.widget.EditText;
//        import android.widget.Toast;
//
//        import com.google.firebase.database.DataSnapshot;
//        import com.google.firebase.database.DatabaseError;
//        import com.google.firebase.database.DatabaseReference;
//        import com.google.firebase.database.FirebaseDatabase;
//        import com.google.firebase.database.ValueEventListener;
//
//        import java.util.ArrayList;
//        import java.util.Date;
//        import java.util.Objects;
//
//public class AddUser extends AppCompatActivity {
//
//    DatabaseReference databaseReference;
//
//    RecyclerView recyclerView;
//    ArrayList<UserItem> UserItemArrayList;
//    UsersRecyclerAdapter adapter;
//    Button buttonAdd;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_add_user);
//
//        Objects.requireNonNull(getSupportActionBar()).hide();
//
//        databaseReference = FirebaseDatabase.getInstance().getReference();
//
//        recyclerView = findViewById(R.id.tt);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        UserItemArrayList = new ArrayList<>();
//        buttonAdd = findViewById(R.id.buttonAdd);
//        buttonAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                ViewDialogAdd viewDialogAdd = new ViewDialogAdd();
//                viewDialogAdd.showDialog(AddUser.this);
//
//            }
//        });
//
//        readDate();
//
//    }
//
//    private void readDate() {
//
//        databaseReference.child("USERS").orderByChild("userName").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                UserItemArrayList.clear();
//                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
//                    UserItem user = dataSnapshot.getValue(UserItem.class);
//                    UserItemArrayList.add(user);
//                }
//
//                adapter = new UsersRecyclerAdapter(AddUser.this,UserItemArrayList);
//                recyclerView.setAdapter(adapter);
//                adapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//    }
//
//    public class ViewDialogAdd {
//        public void showDialog(Context context){
//            final Dialog dialog = new Dialog(context);
//            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//            dialog.setContentView(R.layout.alert_dialog_add_new_user);
//
//
//            EditText textName = dialog.findViewById(R.id.textName);
//            EditText textEmail = dialog.findViewById(R.id.textEmail);
//            EditText textCountry = dialog.findViewById(R.id.textCountry);
//
//            Button buttonAdd = dialog.findViewById(R.id.buttonAdd);
//            Button buttonCancel = dialog.findViewById(R.id.buttonCancel);
//
//            buttonAdd.setText("ADD");
//
//            buttonCancel.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    dialog.dismiss();
//                }
//            });
//
//            buttonAdd.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    String id = "user" + new Date().getTime();
//                    String name = textName.getText().toString();
//                    String email = textEmail.getText().toString();
//                    String country = textCountry.getText().toString();
//
//                    if(name.isEmpty() || email.isEmpty() || country.isEmpty()){
//                        Toast.makeText(context, "please Enter All Data",Toast.LENGTH_SHORT).show();
//                    }
//                    else {
//                        databaseReference.child("USERS").child(id).setValue(new UserItem(id,name,email,country));
//                        Toast.makeText(context, "Done!",Toast.LENGTH_SHORT).show();
//                        dialog.dismiss();
//                    }
//
//                }
//            });
//
//            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//            dialog.show();
//
//
//
//
//        }
//    }
//}