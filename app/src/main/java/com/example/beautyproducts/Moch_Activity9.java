package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Moch_Activity9 extends AppCompatActivity {
    Button Add,mo9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_moch9);
        Add=findViewById(R.id.Add);
        mo9=findViewById(R.id.mo9);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,Mochuraizer_Activity.class);
            startActivity(intent);
        });
        mo9.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}