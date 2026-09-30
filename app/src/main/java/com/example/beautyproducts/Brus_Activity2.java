package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Brus_Activity2 extends AppCompatActivity {
    Button Add,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_brus2);
        Add=findViewById(R.id.Add);
        b2=findViewById(R.id.b2);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Brush_Activity.class);
            startActivity(intent);
        });
        b2.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });
    }
}