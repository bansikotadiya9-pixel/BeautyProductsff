package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LB_Activity8 extends AppCompatActivity {
    Button Add,Lb8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lb8);
        Add=findViewById(R.id.Add);
        Lb8=findViewById(R.id.Lb8);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Kajal_Activity.class);
            startActivity(intent);
        });
        Lb8.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}