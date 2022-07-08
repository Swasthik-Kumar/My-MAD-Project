package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin_dashboard extends AppCompatActivity {
    Button add_student;
    Button view_details;
    Button update_details;
    Button delete_student;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_dashboard);
        add_student = findViewById(R.id.add_student);
        view_details = findViewById(R.id.view_student);
        update_details = findViewById(R.id.update_details);
        delete_student = findViewById(R.id.delete_student);

        add_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, admin_add_page.class);
                startActivity(intent);
            }
        });

       /* view_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, admin_view_info_page.class);
                startActivity(intent);
            }
        });*/

       /* update_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this,admin_add_labour_page.class);
                startActivity(intent);
            }
        });*/


        delete_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, admin_delete_page.class);
                startActivity(intent);
            }
        });
    }
}