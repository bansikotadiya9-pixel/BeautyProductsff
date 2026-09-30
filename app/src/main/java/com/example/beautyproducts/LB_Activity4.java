package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LB_Activity4 extends AppCompatActivity {
    Button Add,Lb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lb4);
        Add=findViewById(R.id.Add);
        Lb4=findViewById(R.id.Lb4);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,LipBalm_Activity.class);
            startActivity(intent);
        });
        Lb4.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}