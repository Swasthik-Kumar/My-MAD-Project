package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admin_add_page extends AppCompatActivity {
    EditText sub1,sub2,sub3,sub4,sub5,sub6;
    EditText name,usn,sem,phno;
    EditText username,password;
    Button add;
    Button cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_add_student_page);
        username = findViewById(R.id.admin_update_username_entry);
        password = findViewById(R.id.admin_update_password_entry);
        name = findViewById(R.id.admin_add_name);
        usn = findViewById(R.id.admin_add_usn);
        sem = findViewById(R.id.admin_add_sem);
        phno = findViewById(R.id.admin_add_phno);
        sub1 = findViewById(R.id.admin_add_sub1);
        sub2 = findViewById(R.id.admin_add_sub2);
        sub3 = findViewById(R.id.admin_add_sub3);
        sub4 = findViewById(R.id.admin_add_sub4);
        sub5 = findViewById(R.id.admin_add_sub5);
        sub6 = findViewById(R.id.admin_add_sub6);
        add = findViewById(R.id.admin_add_student);
        cancel = findViewById(R.id.admin_cancel_student);

        database_handler admin_add_handler = new database_handler(this, "labour_management.db",null,1);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username_typed = username.getText().toString();
                String password_typed = password.getText().toString();
                if(username_typed.equals("") || password_typed.equals("")) {
                    Toast.makeText(admin_add_page.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                }
                else{
                    try{
                        admin_add_handler.add_landlord(username_typed,password_typed);
                        Toast.makeText(admin_add_page.this, "Information added to database", Toast.LENGTH_SHORT).show();
                        username.setText("");
                        password.setText("");
                    } catch (Exception e) {
                        Toast.makeText(admin_add_page.this, "Username already found", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                usn.setText("");
                sem.setText("");
                phno.setText("");
                sub1.setText("");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
                sub6.setText("");
            }
        });

    }
}