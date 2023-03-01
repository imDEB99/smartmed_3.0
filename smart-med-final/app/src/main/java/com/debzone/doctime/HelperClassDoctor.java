package com.debzone.doctime;

import android.widget.EditText;

public class HelperClassDoctor {


    String name, email, phone, password,doctype,doccategory,bm_dc_regi_no;

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

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getDoccategory() {
        return doccategory;
    }

    public void setDoccategory(String doccategory) {
        this.doccategory = doccategory;
    }

    public String getBm_dc_regi_no() {
        return bm_dc_regi_no;
    }

    public void setBm_dc_regi_no(String bm_dc_regi_no) {
        this.bm_dc_regi_no = bm_dc_regi_no;
    }

    public HelperClassDoctor(String name, String email, String phone, String password, String doctype, String doccategory, String bm_dc_regi_no) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.doctype = doctype;
        this.doccategory = doccategory;
        this.bm_dc_regi_no = bm_dc_regi_no;
    }
    public HelperClassDoctor(EditText name, EditText email, EditText number, EditText password,EditText doctype, EditText dcocategory,EditText bm_dc_regi_no) {

    }
}

