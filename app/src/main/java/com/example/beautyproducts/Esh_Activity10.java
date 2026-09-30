package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Esh_Activity10 extends AppCompatActivity {
    Button Add,es10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_esh10);
        Add=findViewById(R.id.Add);
        es10=findViewById(R.id.es10);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,EyeShadow_Activity.class);
            startActivity(intent);
        });
        es10.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}