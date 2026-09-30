package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NR_Activity7 extends AppCompatActivity {
    Button Add,nr7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nr7);
        Add=findViewById(R.id.Add);
        nr7=findViewById(R.id.nr7);
        Add.setOnClickListener(view -> {
            Intent intent = new Intent(this,NailsRemover_Activity.class);
            startActivity(intent);
        });
        nr7.setOnClickListener(view -> {
            Intent intent=new Intent(this,Pay_Activity.class);
            startActivity(intent);
        });

    }
}