package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NP_Activity11 extends AppCompatActivity {
    Button Add,np11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_np11);
        Add=findViewById(R.id.Add);
        np11=findViewById(R.id.np11);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,NailsPolis_Activity.class);
            startActivity(intent);
        });
        np11.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });


    }
}