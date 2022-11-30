package com.example.thuchanhcuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pheptinh extends AppCompatActivity {

    EditText edita, editb, ketqua;
    Button tinhtong, clear;
    TextView lichsu;
    String ls = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pheptinh);
        //Ánh xạ id
        edita = findViewById(R.id.edita);
        editb = findViewById(R.id.editb);
        ketqua = findViewById(R.id.ketqua);
        tinhtong = findViewById(R.id.tinhtong);
        clear = findViewById(R.id.clear);
        lichsu = findViewById(R.id.lichsu);

        //Đọc lại dữ liệu đã lưu trong SharedPreferences
        SharedPreferences mypref = getSharedPreferences("mysave", MODE_PRIVATE);
        ls = mypref.getString("history", "");
        lichsu.setText(ls);

        //Xử lý phép cộng
        tinhtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edita.getText().toString());
                int b = Integer.parseInt(editb.getText().toString());
                int kq = a + b;
                ketqua.setText(kq+"");
                ls += a + " + " + b + " = " + kq;
                lichsu.setText(ls);
                ls += "\n";
            }
        });

        //Xử lý Clear
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ls = "";
                lichsu.setText(ls);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        //4 bước lưu dữ liệu
        SharedPreferences mypref = getSharedPreferences("mysave", MODE_PRIVATE);
        SharedPreferences.Editor myedit = mypref.edit();
        myedit.putString("history", ls);
        myedit.commit();
    }
}

