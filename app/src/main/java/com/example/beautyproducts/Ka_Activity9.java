package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ka_Activity9 extends AppCompatActivity {
    Button Add,k9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ka9);
        Add=findViewById(R.id.Add);
        k9=findViewById(R.id.k9);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Kajal_Activity.class);
            startActivity(intent);
        });
        k9.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });


    }
}