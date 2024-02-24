package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class myfarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myfarm);
    }

    public void onButton1Click(View view) {
        // 클릭 이벤트 처리 코드

        // Intent를 사용하여 새로운 화면으로 이동
        Intent intent = new Intent(this, check_soil.class);
        startActivity(intent);
    }

    public void onButton2Click(View view) {
        // 클릭 이벤트 처리 코드

        // Intent를 사용하여 새로운 화면으로 이동
        Intent intent = new Intent(this, check_air.class);
        startActivity(intent);
    }

    public void onButton3Click(View view) {
        // 클릭 이벤트 처리 코드

        // Intent를 사용하여 새로운 화면으로 이동
        Intent intent = new Intent(this, check_moisture.class);
        startActivity(intent);
    }
}
