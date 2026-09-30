package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Hig_Activity3 extends AppCompatActivity {
    Button Add,hig3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hig3);
        Add=findViewById(R.id.Add);
        hig3=findViewById(R.id.hig3);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Highlighter_Activity.class);
            startActivity(intent);
        });
        hig3.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}