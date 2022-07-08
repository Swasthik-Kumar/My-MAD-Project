package com.example.myproject;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class admin_update_search_page extends AppCompatActivity {
    TextView search;
    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       /* super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_update_search_page);
        search = findViewById(R.id.admin_search_student);

        String username_got = getIntent().getStringExtra("username");
        database_handler admin_student_search_handler = new database_handler(this, "My_Project.db",null,1);
        arrayList = (ArrayList) admin_student_search_handler.get_student_info(username_got);

        ArrayList<student_search_pattern> arrayList_display = new ArrayList<>();
        ArrayList<student_search_pattern> arrayList = new ArrayList<>();
        ArrayList<student_search_pattern> array = new ArrayList<>();
        arrayList = student_search_handler.get_labour();

    }


        int count = arrayList.size();
//        Toast.makeText(this, ""+count, Toast.LENGTH_LONG).show();
        arrayList= arrayList.get(0);
//        Toast.makeText(this, ""+arrayList.get(0), Toast.LENGTH_LONG).show();

        for(int i=0; i<count*4;i+=4){
            arrayList_display.add(new landlord_search_pattern(R.drawable.ic_launcher_background,""+array.get(i),""+array.get(i+1)+"  Rs."+array.get(i+2),""+array.get(i+3)));

        }

        custom_adapter customadapter = new custom_adapter(this, R.layout.landlord_search_page_pattern,arrayList_display);
        TextView.setAdapter((customadapter));*/

    }
}
        /*ArrayList<student_search_pattern> arrayList_display = new ArrayList<>();
        ArrayList<landlord_search_pattern> arrayList = new ArrayList<>();
        ArrayList<landlord_search_pattern> array = new ArrayList<>();
        arrayList = landlord_search_handler.get_labour();
        int count = arrayList.size();
//        Toast.makeText(this, ""+count, Toast.LENGTH_LONG).show();
        array = arrayList.get(0);
//        Toast.makeText(this, ""+arrayList.get(0), Toast.LENGTH_LONG).show();

        for(int i=0; i<count*4;i+=4){
            arrayList_display.add(new landlord_search_pattern(R.drawable.ic_launcher_background,""+array.get(i),""+array.get(i+1)+"  Rs."+array.get(i+2),""+array.get(i+3)));

        }

        custom_adapter customadapter = new custom_adapter(this, R.layout.landlord_search_page_pattern,arrayList_display);
        listView.setAdapter((customadapter));*/