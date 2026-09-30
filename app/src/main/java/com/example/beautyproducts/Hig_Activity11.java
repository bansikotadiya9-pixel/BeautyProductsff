package com.example.beautyproducts;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Hig_Activity11 extends AppCompatActivity {
    Button Add,hig11;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hig11);
        Add=findViewById(R.id.Add);
        hig11=findViewById(R.id.hig11);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Highlighter_Activity.class);
            startActivity(intent);
        });
        hig11.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}