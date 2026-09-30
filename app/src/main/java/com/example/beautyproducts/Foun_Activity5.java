package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Foun_Activity5 extends AppCompatActivity {
    Button Add,f5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_foun5);
        Add=findViewById(R.id.Add);
        f5=findViewById(R.id.f5);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foundation_Activity.class);
            startActivity(intent);
        });
        f5.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}