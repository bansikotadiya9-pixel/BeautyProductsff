package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Comp_Activity6 extends AppCompatActivity {
    Button Add,com6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_comp6);
        Add=findViewById(R.id.Add);
        com6=findViewById(R.id.com6);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,CompactActivity.class);
            startActivity(intent);
        });
        com6.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });
    }
}