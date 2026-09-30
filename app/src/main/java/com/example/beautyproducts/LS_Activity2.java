package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LS_Activity2 extends AppCompatActivity {
    Button Add,ls2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ls2);
        Add=findViewById(R.id.Add);
        ls2=findViewById(R.id.ls2);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Liptick_Activity.class);
            startActivity(intent);
        });
        ls2.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}