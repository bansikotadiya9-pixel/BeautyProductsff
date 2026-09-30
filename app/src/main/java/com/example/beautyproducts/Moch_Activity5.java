package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Moch_Activity5 extends AppCompatActivity {
    Button Add,mo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_moch5);
        Add=findViewById(R.id.Add);
        mo5=findViewById(R.id.mo5);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Mochuraizer_Activity.class);
            startActivity(intent);
        });
        mo5.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}