package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Eline_Activity3 extends AppCompatActivity {
    Button Add,el3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eline3);
        Add=findViewById(R.id.Add);
        el3=findViewById(R.id.el3);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,EyeLiner_Activity.class);
            startActivity(intent);
        });
        el3.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });
    }
}