package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class find_disease extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_disease);
    }

    public void onButton1Click(View view) {
        // 클릭 이벤트 처리 코드

        // Intent를 사용하여 새로운 화면으로 이동
        Intent intent = new Intent(this, answer_disease.class);
        startActivity(intent);
    }
}
