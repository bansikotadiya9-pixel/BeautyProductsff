package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LB_Activity1 extends AppCompatActivity {
    Button Add,Lb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lb1);
        Add=findViewById(R.id.Add);
        Lb1=findViewById(R.id.Lb1);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,LipBalm_Activity.class);
            startActivity(intent);
        });
        Lb1.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}