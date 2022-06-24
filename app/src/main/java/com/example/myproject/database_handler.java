package com.example.myproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class database_handler extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "My_Project.db";
    public static final String TABLE_NAME_LOGIN = "login_table";
    public static final String TABLE_NAME_STUDENT = "student_table";
    public static final String TABLE_NAME_MARKS = "marks_table";

    public database_handler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_login_table = "CREATE TABLE if not exists login_table (username Text primary key,password Text, role Text)";
        sqLiteDatabase.execSQL(create_login_table);
        String create_student_table = "CREATE TABLE if not exists student_table (username Text primary key,name Text ,usn Text, sem int,phno Text)";
        sqLiteDatabase.execSQL(create_student_table);
        String create_marks_table = "CREATE TABLE if not exists marks_table (username Text primary key,sub1 int,sub2 int,sub3 int,sub4 int,sub5 int,sub6 int)";
        sqLiteDatabase.execSQL(create_marks_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop = String.valueOf("DROP TABLE IF EXISTS");
        sqLiteDatabase.execSQL(drop, new String[]{"login_table"});
        onCreate(sqLiteDatabase);
    }

    public Cursor get_credential(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("login_table",new String[]{"username","password","role"},"username=?",new String[]{String.valueOf(username)},null,null,null);
        if(cursor != null && cursor.moveToFirst()){
            Log.d("mytag",cursor.getString(0));
            Log.d("mytag",cursor.getString(1));
        }
        else{
            Log.d("mytag","Some error");
        }
        return cursor;
    }

    public Cursor get_student_info(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("landlord_table",new String[]{"username","name","usn","sem","phone"},"username=?",new String[]{String.valueOf(username)},null,null,null);
        if(cursor != null && cursor.moveToFirst()){
            Log.d("mytag",cursor.getString(0));
            Log.d("mytag",cursor.getString(1));
        }
        else{
            Log.d("mytag","Some error");
        }
        return cursor;
    }

    public void add_admin(String username, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("username",username);
        values.put("password",password);
        values.put("role","admin");
        long k = db.insert(TABLE_NAME_LOGIN,null,values);
        db.close();
    }

    public long add_student(String username, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        ContentValues values_marks = new ContentValues();
        values.put("username",username);
        values.put("password",password);
        values.put("role","student");
        long k = db.insert(TABLE_NAME_LOGIN,null,values);
        values.put("username",username);
        values_marks.put("subject 1","null");
        values_marks.put("subject 2","null");
        values_marks.put("subject 3","null");
        values_marks.put("subject 4","null");
        values_marks.put("subject 5","null");
        values_marks.put("subject 6","null");
        long l = db.insert(TABLE_NAME_MARKS,null,values_marks);
        Log.d("mytag", String.valueOf(l));
        db.close();
        return l;
    }

    public boolean update_marks(String username_entered, int sub1, int sub2,int sub3,int sub4,int sub5,int sub6){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values_marks = new ContentValues();
        values_marks.put("username",username_entered);
        values_marks.put("subject 1",sub1);
        values_marks.put("subject 2",sub2);
        values_marks.put("subject 3",sub3);
        values_marks.put("subject 4",sub4);
        values_marks.put("subject 5",sub5);
        values_marks.put("subject 6",sub6);
        long k = db.update(""+TABLE_NAME_MARKS,values_marks,"username=?",new String[]{username_entered});
        db.close();
        return true;

    }

    public long delete_student(String username_entry){
        SQLiteDatabase db = this.getWritableDatabase();
        String username = "username";
        long k =db.delete(""+TABLE_NAME_LOGIN,username+"=?",new String[]{username_entry});
        long l =db.delete(""+TABLE_NAME_STUDENT,username+"=?",new String[]{username_entry});
        long m =db.delete(""+TABLE_NAME_MARKS,username+"=?",new String[]{username_entry});
        db.close();
        Log.d("mytag", String.valueOf(k));
        return k;
    }

}
