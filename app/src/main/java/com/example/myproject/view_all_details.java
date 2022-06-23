package com.example.myproject;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class view_all_details extends AppCompatActivity{
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
    Cursor view_details_handler_cursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_view_all_students);
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

        String landlord_id = getIntent().getStringExtra("landlord_id");
        String labour_id = getIntent().getStringExtra("labour_id");
        String salary = getIntent().getStringExtra("salary");
        int salary_num = Integer.parseInt(salary);

        database_handler view_details_handler = new database_handler(this, "My_Project.db",null,1);

//

        try {

            view_details_handler_cursor = view_details_handler.get_student_info(String username);

            if (view_details_handler_cursor.getString(0).equals(labour_id)) {
                name.setText(view_details_handler_cursor.getString(0));
                usn.setText(view_details_handler_cursor.getString(1));
                sem.setText(view_details_handler_cursor.getString(2));
                phone.setText(view_details_handler_cursor.getString(3));
                sub1.setText(view_details_handler_cursor.getString(4));
                sub2.setText(view_details_handler_cursor.getString(5));
                sub3.setText(view_details_handler_cursor.getString(6));
                sub4.setText(view_details_handler_cursor.getString(7));
                sub5.setText(view_details_handler_cursor.getString(8));
                sub6.setText(view_details_handler_cursor.getString(9));

            }

        }
        catch (Exception e){
            Toast.makeText(this, "You have not yet took his attendance", Toast.LENGTH_LONG).show();
            name.setText("Null");
            usn.setText("Null");
            sem.setText("Null");
            phone.setText("Null");
            sub1.setText("Null");
            sub2.setText("Null");
            sub3.setText("Null");
            sub4.setText("Null");
            sub5.setText("Null");
            sub6.setText("Null");

        }
    }
}