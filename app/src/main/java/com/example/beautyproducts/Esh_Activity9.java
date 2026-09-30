package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Esh_Activity9 extends AppCompatActivity {
    Button Add,es9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_esh9);
        Add=findViewById(R.id.Add);
        es9=findViewById(R.id.es9);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,EyeShadow_Activity.class);
            startActivity(intent);
        });
        es9.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}