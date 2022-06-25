package com.example.myproject;


        import java.util.ArrayList;

public class admin_view_info_pattern extends ArrayList<student_search_pattern> {
    String name;
    String usn;
    String sem;
    String phone_num;

    public landlord_search_pattern(String name, String usn, String sem,String phone_num) {
        this.name = name;
        this.usn = usn;
        this.sem = sem;
        this.phone_num = phone_num;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsn() {
        return usn;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;


    }
}

