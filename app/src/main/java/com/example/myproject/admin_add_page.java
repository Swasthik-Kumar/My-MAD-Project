package com.example.myproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class admin_add_page extends AppCompatActivity{
    EditText username;
    EditText password;
    Button add;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_add_page);
        username = findViewById(R.id.add_admin_username);
        password = findViewById(R.id.add_admin_password);
        add = findViewById(R.id.admin_delete_student_btn);
        cancel = findViewById(R.id.admin_cancel_student_btn);


        database_handler admin_add_handler = new database_handler(this, "My_Project.db",null,1);

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
                        long result = admin_add_handler.add_student(username_typed,password_typed);
                        if(result!=-1) {
                            Toast.makeText(admin_add_page.this, "Information added to database", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                        else{
                            Toast.makeText(admin_add_page.this, "Username already found", Toast.LENGTH_SHORT).show();
                        }
                    } catch (Exception e) {
                        Toast.makeText(admin_add_page.this, "Some error occurred", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.setText("");
                password.setText("");
            }
        });

    }
}