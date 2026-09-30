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

public class LB_Activity9 extends AppCompatActivity {
    Button Add,Lb9;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lb9);
        Add=findViewById(R.id.Add);
        Lb9=findViewById(R.id.Lb9);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Kajal_Activity.class);
            startActivity(intent);
        });
        Lb9.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}