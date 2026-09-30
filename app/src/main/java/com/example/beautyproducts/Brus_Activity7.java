package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Brus_Activity7 extends AppCompatActivity {
    Button Add,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_brus7);
        Add=findViewById(R.id.Add);
        b7=findViewById(R.id.b7);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Brush_Activity.class);
            startActivity(intent);
        });
        b7.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });
    }
}