package com.example.beautyproducts;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Nails_Activity extends AppCompatActivity {
    ImageView nails1,nails2,nails3,nails4,nails5,nails6,nails7,nails8,nails9,nails10,nails11,nails12;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nails);
        nails1=findViewById(R.id.Nai1);
        nails2=findViewById(R.id.Nai2);
        nails3=findViewById(R.id.Nai3);
        nails4=findViewById(R.id.Nai4);
        nails5=findViewById(R.id.Nai5);
        nails6=findViewById(R.id.Nai6);
        nails7=findViewById(R.id.Nai7);
        nails8=findViewById(R.id.Nai8);
        nails9=findViewById(R.id.Nai9);
        nails10=findViewById(R.id.Nai10);
        nails11=findViewById(R.id.Nai11);
        nails12=findViewById(R.id.Nai12);
        nails1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity1.class);
            startActivity(intent);
        });
        nails2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity2.class);
            startActivity(intent);
        });
        nails3.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity3.class);
            startActivity(intent);
        });
        nails4.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity4.class);
            startActivity(intent);
        });
        nails5.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity5.class);
            startActivity(intent);
        });
        nails6.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity6.class);
            startActivity(intent);
        });
        nails7.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity7.class);
            startActivity(intent);
        });
        nails8.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity8.class);
            startActivity(intent);
        });
        nails9.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity9.class);
            startActivity(intent);
        });
        nails10.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity10.class);
            startActivity(intent);
        });
        nails11.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity11.class);
            startActivity(intent);
        });
        nails12.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nai_Activity12.class);
            startActivity(intent);
        });

    }
}