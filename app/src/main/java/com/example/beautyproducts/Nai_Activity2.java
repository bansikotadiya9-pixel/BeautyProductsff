package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Nai_Activity2 extends AppCompatActivity {
    Button Add,Na2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nai2);
        Add=findViewById(R.id.Add);
        Na2=findViewById(R.id.Na2);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nails_Activity.class);
            startActivity(intent);
        });
        Na2.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });


    }
}