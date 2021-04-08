package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bai3_1 extends AppCompatActivity {
    Button btnChonmau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btnChonmau = findViewById(R.id.btnChonmau);
        btnChonmau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mo();
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_1);
    }
        public void mo(){
            Intent intent =new Intent(this, Bai3_2.class);
            startActivity(intent);
        }
    }
