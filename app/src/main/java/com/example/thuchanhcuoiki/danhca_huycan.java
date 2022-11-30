package com.example.thuchanhcuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class danhca_huycan extends AppCompatActivity {
    //Khai báo biến
    EditText editmacau, editcauvidu;
    Button insert, delete, update, reload;
    ListView hientaidon;
    ArrayList<String> mylist;
    ArrayAdapter<String> myadapter;
    SQLiteDatabase mydatabase;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhca);

        editmacau = findViewById(R.id.editmacau);

        insert = findViewById(R.id.insert);
        reload = findViewById(R.id.reload);

        hientaidon = findViewById(R.id.hientaidon);
        mylist = new ArrayList<>();
        myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mylist);
        hientaidon.setAdapter(myadapter);

        mydatabase = openOrCreateDatabase("huycan.db", MODE_PRIVATE,null);

        try {
            String sql = "CREATE TABLE danhca(macau TEXT primary key, cau TEXT)";
            mydatabase.execSQL(sql);
        }
        catch (Exception e){
            Log.e("Error", "Bảng đã tồn tại");
        }
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String macau = editmacau.getText().toString();
                String cau = editcauvidu.getText().toString();
                ContentValues myvalue = new ContentValues();
                myvalue.put("macau", macau);
                myvalue.put("cau",cau);
                String msg = "";
                if(mydatabase.insert("danhca", "", myvalue) == -1){
                    msg= "FALL to Insert Record";
                }else {
                    msg = "Insert Record Successfully";
                }
                Toast.makeText(danhca_huycan.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mylist.clear();
                Cursor c = mydatabase.query("danhca", null,null, null, null,null,null);
                c.moveToNext();
                String data = "";
                while (c.isAfterLast() == false){
                    data = c.getString(0) + " - " + c.getString(1);
                    c.moveToNext();
                    mylist.add(data);
                }
                c.close();
                myadapter.notifyDataSetChanged();
            }
        });
    }
}