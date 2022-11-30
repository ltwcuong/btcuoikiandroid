package com.example.thuchanhcuoiki;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edituser, editpass;
    Button buttondangnhap, buttondangky, buttonthoat;
    String ten, mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ControlButton();
    }
    private void ControlButton(){
        buttonthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Bạn có muốn thoát khỏi chương trình không");
                builder.setMessage("Hãy lựa chọn xác nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
        buttondangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Hộp thoại đăng kí");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.customdialog);
                EditText edittk = (EditText) dialog.findViewById(R.id.edittk);
                EditText editmk = (EditText) dialog.findViewById(R.id.editmk);
                Button buttonhuy = (Button) dialog.findViewById(R.id.buttonhuy);
                Button buttondk = (Button) dialog.findViewById(R.id.buttondk);
                buttondk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edittk.getText().toString().trim();
                        mk = editmk.getText().toString().trim();

                        edituser.setText(ten);
                        editpass.setText(mk);

                        dialog.cancel();
                    }
                });
                buttonhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
        buttondangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edituser.getText().length()!= 0 && editpass.getText().length() != 0){
                    if(edituser.getText().toString().equals(ten) && editpass.getText().toString().equals(mk)){
                        Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }else if(edituser.getText().toString().equals("admin") && editpass.getText().toString().equals("admin")){
                        Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void Anhxa(){
        edituser = (EditText) findViewById(R.id.edittextuser);
        editpass = (EditText) findViewById(R.id.edittextpass);
        buttondangnhap = (Button) findViewById(R.id.buttondangnhap);
        buttondangky = (Button) findViewById(R.id.buttondangky);
        buttonthoat = (Button) findViewById(R.id.buttonthoat);
    }
}