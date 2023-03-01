 package com.debzone.doctime;

         import android.widget.EditText;

 public class HelperClass {


     String name, email, phone, password;

     public HelperClass(String strName, String strEmail, String strNumber, String strPassword, String strDocType, String strDocCategory, String strBmDcNo) {
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getPhone() {
         return phone;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }

     public String getPassword() {
         return password;
     }

     public void setPassword(String password) {
         this.password = password;
     }

     public HelperClass(String name, String email, String phone, String password) {
         this.name = name;
         this.email = email;
         this.phone = phone;
         this.password = password;
     }
     public HelperClass(EditText name, EditText email, EditText number, EditText password) {

     }
 }
