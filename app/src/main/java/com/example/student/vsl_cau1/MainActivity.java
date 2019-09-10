package com.example.student.vsl_cau1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    Button btnDN,btnThoat;
    CheckBox checkLuu;
    AlertDialog.Builder thongbao1;
    AlertDialog.Builder thongbao2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDN=(Button)findViewById(R.id.buttonDangNhap);
        checkLuu=(CheckBox)findViewById(R.id.checkBoxLuu);
        thongbao1=new AlertDialog.Builder(this);
        thongbao1.setTitle("Thông báo");
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkLuu.isChecked()){
                    thongbao1.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu !");
                }
                else
                {
                    thongbao1.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu !");
                }
                thongbao1.show();
            }
        });
        btnThoat=(Button)findViewById(R.id.btnThoat);
        thongbao2=new AlertDialog.Builder(this);
        thongbao2.setTitle("Thông báo");
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thongbao2.setMessage("Bạn có muốn thoát không ?");
                thongbao2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                thongbao2.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                thongbao2.show();
            }

        });

    }
}
