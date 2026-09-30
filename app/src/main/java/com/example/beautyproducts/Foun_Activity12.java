package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Foun_Activity12 extends AppCompatActivity {
    Button Add,f12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_foun12);
        Add=findViewById(R.id.Add);
        f12=findViewById(R.id.f12);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foundation_Activity.class);
            startActivity(intent);
        });
        f12.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}