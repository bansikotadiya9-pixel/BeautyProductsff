package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Eline_Activity4 extends AppCompatActivity {
    Button Add,el4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eline4);
        Add=findViewById(R.id.Add);
        el4=findViewById(R.id.el4);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,EyeLiner_Activity.class);
            startActivity(intent);
        });
        el4.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });
    }
}