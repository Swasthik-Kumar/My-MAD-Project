package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin_dashboard extends AppCompatActivity {
    Button add_student;
    Button view;
    Button update_marks;
    Button delete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_dashboard);
        add_student = findViewById(R.id.adds);
        view = findViewById(R.id.views);
        update_marks = findViewById(R.id.updatem);
        delete = findViewById(R.id.deletes);


        add_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, admin_add_page.class);
                startActivity(intent);
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, admin_view_all_students.class);
                startActivity(intent);
            }
        });

        update_marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, admin_update_page.class);
                startActivity(intent);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_dashboard.this, admin_delete_page.class);
                startActivity(intent);
            }
        });
    }
}