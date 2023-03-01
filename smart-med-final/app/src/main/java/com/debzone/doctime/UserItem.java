package com.debzone.doctime;

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//public class userItem extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_user_item);
//    }
//}

public class UserItem {

    String userId;
    String userName;
    String userEmail;
    String userCountry;

    public UserItem() {
    }

    public UserItem(String userId, String userName, String userEmail, String userCountry) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userCountry = userCountry;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }
}
