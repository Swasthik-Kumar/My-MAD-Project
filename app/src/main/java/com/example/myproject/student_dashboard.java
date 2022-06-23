package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class student_dashboard extends AppCompatActivity{
    TextView name;
    TextView usn;
    TextView sem;
    TextView phone;
    TextView sub1;
    TextView sub2;
    TextView sub3;
    TextView sub4;
    TextView sub5;
    TextView sub6;
    Cursor student_details_handler_cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_dashboard);
        name = findViewById(R.id.admin_txtview_name);
        usn = findViewById(R.id.admin_txtview_usn);
        sem = findViewById(R.id.admin_txtview_sem);
        phone = findViewById(R.id.admin_txtview_phone);
        sub1 = findViewById(R.id.admin_txtview_sub1);
        sub2 = findViewById(R.id.admin_txtview_sub2);
        sub3 = findViewById(R.id.admin_txtview_sub3);
        sub4 = findViewById(R.id.admin_txtview_sub4);
        sub5 = findViewById(R.id.admin_txtview_sub5);
        sub6 = findViewById(R.id.admin_txtview_sub6);

        String username_got = getIntent().getStringExtra("username");
        database_handler student_details_handler = new database_handler(this, "My_Project.db",null,1);
        name.setText(student_details_handler_cursor.getString(0));
        usn.setText(student_details_handler_cursor.getString(1));
        sem.setText(student_details_handler_cursor.getString(2));
        phone.setText(student_details_handler_cursor.getString(3));
        sub1.setText(student_details_handler_cursor.getString(4));
        sub2.setText(student_details_handler_cursor.getString(5));
        sub3.setText(student_details_handler_cursor.getString(6));
        sub4.setText(student_details_handler_cursor.getString(7));
        sub5.setText(student_details_handler_cursor.getString(8));
        sub6.setText(student_details_handler_cursor.getString(9));
    }
}