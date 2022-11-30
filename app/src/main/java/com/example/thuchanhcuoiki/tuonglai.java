package com.example.thuchanhcuoiki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class tuonglai extends AppCompatActivity {
    ListView listView;
    ArrayList<Thongtin> arrayList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huycan);
        listView = findViewById(R.id.listviewhuycan);
        arrayList = new ArrayList<>();
        arrayList.add(new Thongtin( "Tràng giang", "", R.drawable.img_1));
        arrayList.add(new Thongtin( "Ta viết bài thơ gọi biển về", "", R.drawable.bien));
        arrayList.add(new Thongtin( "Đoàn thuyền đánh cá", "", R.drawable.dtdc));
        arrayList.add(new Thongtin( "Ngậm ngùi", "", R.drawable.ngamngui));
        arrayList.add(new Thongtin( "Con chim chiền chiện", "", R.drawable.cccc));
        adapter = new Adapter( tuonglai.this,R.layout.layout_huycan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(tuonglai.this, com.example.thuchanhcuoiki.tranggiang_huycan.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(tuonglai.this, com.example.thuchanhcuoiki.danhca_huycan.class);
                    startActivity(intent);
                }
            }
        });
    }
}