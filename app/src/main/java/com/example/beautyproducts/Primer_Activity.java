package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Primer_Activity extends AppCompatActivity {
    ImageView P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_primer);
        P1=findViewById(R.id.Pr1);
        P2=findViewById(R.id.Pr2);
        P3=findViewById(R.id.Pr3);
        P4=findViewById(R.id.Pr4);
        P5=findViewById(R.id.Pr5);
        P6=findViewById(R.id.Pr6);
        P7=findViewById(R.id.Pr7);
        P8=findViewById(R.id.Pr8);
        P9=findViewById(R.id.Pr9);
        P10=findViewById(R.id.Pr10);
        P11=findViewById(R.id.Pr11);
        P12=findViewById(R.id.Pr12);
        P1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity1.class);
            startActivity(intent);
        });
        P2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity2.class);
            startActivity(intent);
        });
        P3.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity3.class);
            startActivity(intent);
        });
        P4.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity4.class);
            startActivity(intent);
        });
        P5.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity5.class);
            startActivity(intent);
        });
        P6.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity6.class);
            startActivity(intent);
        });
        P7.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity7.class);
            startActivity(intent);
        });
        P8.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity8.class);
            startActivity(intent);
        });
        P9.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity9.class);
            startActivity(intent);
        });
        P10.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity10.class);
            startActivity(intent);
        });
        P11.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity11.class);
            startActivity(intent);
        });
        P12.setOnClickListener(view -> {
            Intent intent = new Intent(this,Pri_Activity12.class);
            startActivity(intent);
        });
    }
}