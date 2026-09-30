package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LS_Activity5 extends AppCompatActivity {
    Button Add,ls5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ls5);
        Add=findViewById(R.id.Add);
        ls5=findViewById(R.id.ls5);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Liptick_Activity.class);
            startActivity(intent);
        });
        ls5.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}