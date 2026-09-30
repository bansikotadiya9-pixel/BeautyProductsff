package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NailsPolis_Activity extends AppCompatActivity {
    ImageView Np1,Np2,Np3,Np4,Np5,Np6,Np7,Np8,Np9,Np10,Np11,Np12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nails_polis);
        Np1=findViewById(R.id.Nail1);
        Np2=findViewById(R.id.Nail2);
        Np3=findViewById(R.id.Nail3);
        Np4=findViewById(R.id.Nail4);
        Np5=findViewById(R.id.Nail5);
        Np6=findViewById(R.id.Nail6);
        Np7=findViewById(R.id.Nail7);
        Np8=findViewById(R.id.Nail8);
        Np9=findViewById(R.id.Nail9);
        Np10=findViewById(R.id.Nail10);
        Np11=findViewById(R.id.Nail11);
        Np12=findViewById(R.id.Nail12);
        Np1.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity1.class);
            startActivity(intent);
        });
        Np2.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity2.class);
            startActivity(intent);
        });
        Np3.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity3.class);
            startActivity(intent);
        });
        Np4.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity4.class);
            startActivity(intent);
        });
        Np5.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity5.class);
            startActivity(intent);
        });
        Np6.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity6.class);
            startActivity(intent);
        });
        Np7.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity7.class);
            startActivity(intent);
        });
        Np8.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity8.class);
            startActivity(intent);
        });
        Np9.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity9.class);
            startActivity(intent);
        });
        Np10.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity10.class);
            startActivity(intent);
        });
        Np11.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity11.class);
            startActivity(intent);
        });
        Np12.setOnClickListener(view -> {
            Intent intent = new Intent(this,NP_Activity12.class);
            startActivity(intent);
        });



    }
}