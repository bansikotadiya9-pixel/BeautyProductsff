package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LS_Activity12 extends AppCompatActivity {
    Button Add,ls12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ls12);
        Add=findViewById(R.id.Add);
        ls12=findViewById(R.id.ls12);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Liptick_Activity.class);
            startActivity(intent);
        });
        ls12.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}