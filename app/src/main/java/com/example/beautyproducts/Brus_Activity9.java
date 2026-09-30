package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Brus_Activity9 extends AppCompatActivity {
    Button Add,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_brsh9);
        Add=findViewById(R.id.Add);
        b9=findViewById(R.id.b9);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Brush_Activity.class);
            startActivity(intent);
        });
        b9.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });
    }
}