package com.example.myproject;

/*import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class admin_update_page extends AppCompatActivity{
    EditText name;
    EditText usn;
    EditText sem;
    EditText phone;
    EditText sub1;
    EditText sub2;
    EditText sub3;
    EditText sub4;
    EditText sub5;
    EditText sub6;
    Button update;
    Button cancel;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_update_page);
        name = findViewById(R.id.admin_update_name);
        usn = findViewById(R.id.admin_update_usn);
        sem = findViewById(R.id.admin_update_sem);
        phone = findViewById(R.id.admin_update_phone);
        sub1 = findViewById(R.id.admin_update_sub1);
        sub2 = findViewById(R.id.admin_update_sub2);
        sub3 = findViewById(R.id.admin_update_sub3);
        sub4 = findViewById(R.id.admin_update_sub4);
        sub5 = findViewById(R.id.admin_update_sub5);
        sub6 = findViewById(R.id.admin_update_sub6);
        update = findViewById(R.id.admin_update_btn);
        cancel = findViewById(R.id.admin_update_cancel);

        String username_got = getIntent().getStringExtra("username");
        database_handler student_update_handler = new database_handler(this, "My_Project.db",null,1);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_entered = name.getText().toString();
                String usn_entered = usn.getText().toString();
                String sem_entered = sem.getText().toString();
                String phone_entered = phone.getText().toString();
                String sub1_entered = sub1.getText().toString();
                String sub2_entered = sub2.getText().toString();
                String sub3_entered = sub3.getText().toString();
                String sub4_entered = sub4.getText().toString();
                String sub5_entered = sub5.getText().toString();
                String sub6_entered = sub6.getText().toString();

                if(name_entered.equals("") || usn_entered.equals("") ||sem_entered.equals("")|| phone_entered.equals("")||sub1_entered.equals("") ||sub2_entered.equals("") ||sub3_entered.equals("") ||sub4_entered.equals("") ||sub5_entered.equals("") ||sub6_entered.equals("")) {
                    Toast.makeText(admin_update_page.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                }
                else{
                    try{
                        boolean t = student_update_handler.admin_update(username_got,name_entered,Integer.parseInt(age_entered),sem_entered,phone_entered,sub1_entered,Integer.parseInt(no_of_team_member_enterd),work_enterd,Integer.parseInt(wage_enterd),Integer.parseInt(working_days_enterd));
                        Toast.makeText(admin_update_page.this, "Information updated to database", Toast.LENGTH_SHORT).show();
                        finish();


                    } catch (Exception e) {
                        Toast.makeText(admin_update_page.this, "Username already found", Toast.LENGTH_SHORT).show();
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
                phone.setText("");
                sub1.setText("");
                sub2.setText("");
                sub3.setText("");
                sub4.setText("");
                sub5.setText("");
                sub6.setText("");
            }
        });


    }
}*/