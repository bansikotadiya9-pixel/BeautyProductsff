package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Liptick_Activity extends AppCompatActivity {
    ImageView L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_liptick);
        L1=findViewById(R.id.Lp1);
        L2=findViewById(R.id.Lp2);
        L3=findViewById(R.id.Lp3);
        L4=findViewById(R.id.Lp4);
        L5=findViewById(R.id.Lp5);
        L6=findViewById(R.id.Lp6);
        L7=findViewById(R.id.Lp7);
        L8=findViewById(R.id.Lp8);
        L9=findViewById(R.id.Lp9);
        L10=findViewById(R.id.Lp10);
        L11=findViewById(R.id.Lp11);
        L12=findViewById(R.id.Lp12);
        L1.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity1.class);
            startActivity(intent);
        });
        L2.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity2.class);
            startActivity(intent);
        });
        L3.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity3.class);
            startActivity(intent);
        });
        L4.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity4.class);
            startActivity(intent);
        });
        L5.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity5.class);
            startActivity(intent);
        });
        L6.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity6.class);
            startActivity(intent);
        });
        L7.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity7.class);
            startActivity(intent);
        });
        L8.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity8.class);
            startActivity(intent);
        });
        L9.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity9.class);
            startActivity(intent);
        });
        L10.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity10.class);
            startActivity(intent);
        });
        L11.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity11.class);
            startActivity(intent);
        });
        L12.setOnClickListener(view -> {
            Intent intent = new Intent(this,LS_Activity12.class);
            startActivity(intent);
        });

    }
}