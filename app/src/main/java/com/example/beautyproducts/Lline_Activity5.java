package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lline_Activity5 extends AppCompatActivity {
    Button Add,ll5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lline5);
        Add=findViewById(R.id.Add);
        ll5=findViewById(R.id.ll5);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,LipLiner_Activity.class);
            startActivity(intent);
        });
        ll5.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}