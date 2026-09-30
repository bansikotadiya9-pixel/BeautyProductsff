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

public class CompactActivity extends AppCompatActivity {
    ImageView Com1,Com2,Com3,Com4,Com5,Com6,Com7,Com8,Com9,Com10,Com11,Com12;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_compact);
        Com1=findViewById(R.id.Com1);
        Com2=findViewById(R.id.Com2);
        Com3=findViewById(R.id.Com3);
        Com4=findViewById(R.id.Com4);
        Com5=findViewById(R.id.Com5);
        Com6=findViewById(R.id.Com6);
        Com7=findViewById(R.id.Com7);
        Com8=findViewById(R.id.Com8);
        Com9=findViewById(R.id.Com9);
        Com10=findViewById(R.id.Com10);
        Com11=findViewById(R.id.Com11);
        Com12=findViewById(R.id.Com12);
        Com1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity1.class);
            startActivity(intent);
        });
        Com2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity2.class);
            startActivity(intent);
        });
        Com3.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity3.class);
            startActivity(intent);
        });
        Com4.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity4.class);
            startActivity(intent);
        });
        Com5.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity5.class);
            startActivity(intent);
        });
        Com6.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity6.class);
            startActivity(intent);
        });
        Com7.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity7.class);
            startActivity(intent);
        });
        Com8.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity8.class);
            startActivity(intent);
        });
        Com9.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity9.class);
            startActivity(intent);
        });
        Com10.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity10.class);
            startActivity(intent);
        });
        Com11.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity11.class);
            startActivity(intent);
        });
        Com12.setOnClickListener(view -> {
            Intent intent = new Intent(this,Comp_Activity12.class);
            startActivity(intent);
        });
    }
}