package com.example.beautyproducts;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Brush_Activity extends AppCompatActivity {
    //CardView Card1;
    ImageView Br1,Br2,Br3,Br4,Br5,Br6,Br7,Br8,Br9,Br10,Br11,Br12;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_brush);
        Br1=findViewById(R.id.br1);
        Br2=findViewById(R.id.br2);
        Br3=findViewById(R.id.br3);
        Br4=findViewById(R.id.br4);
        Br5=findViewById(R.id.br5);
        Br6=findViewById(R.id.br6);
        Br7=findViewById(R.id.br7);
        Br8=findViewById(R.id.br8);
        Br9=findViewById(R.id.br9);
        Br10=findViewById(R.id.br10);
        Br11=findViewById(R.id.br11);
        Br12=findViewById(R.id.br12);
        Br1.setOnClickListener(view -> {
                Intent intent = new Intent(this, Brus_Activity1.class);
                startActivity(intent);
        });
        Br2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Brus_Activity2.class);
            startActivity(intent);
        });
        Br3.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity3.class);
            startActivity(intent);
        });
        Br4.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity4.class);
            startActivity(intent);
        });
        Br5.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity5.class);
            startActivity(intent);
        });
        Br6.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity6.class);
            startActivity(intent);
        });
        Br7.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity7.class);
            startActivity(intent);
        });
        Br8.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity8.class);
            startActivity(intent);
        });
        Br9.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity9.class);
            startActivity(intent);
        });
        Br10.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity10.class);
            startActivity(intent);
        });
        Br11.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity11.class);
            startActivity(intent);
        });
        Br12.setOnClickListener(view -> {
            Intent intent = new Intent(this, Brus_Activity12.class);
            startActivity(intent);
        });
    }
}