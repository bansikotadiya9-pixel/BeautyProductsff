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

public class Kajal_Activity extends AppCompatActivity {
    ImageView Kaj1,Kaj2,Kaj3,Kaj4,Kaj5,Kaj6,Kaj7,Kaj8,Kaj9,Kaj10,Kaj11,Kaj12;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.kajal_activity);
        Kaj1=findViewById(R.id.ka1);
        Kaj2=findViewById(R.id.ka2);
        Kaj3=findViewById(R.id.ka3);
        Kaj4=findViewById(R.id.ka4);
        Kaj5=findViewById(R.id.ka5);
        Kaj6=findViewById(R.id.ka6);
        Kaj7=findViewById(R.id.ka7);
        Kaj8=findViewById(R.id.ka8);
        Kaj9=findViewById(R.id.ka9);
        Kaj10=findViewById(R.id.ka10);
        Kaj11=findViewById(R.id.ka11);
        Kaj12=findViewById(R.id.ka12);

        Kaj1.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity1.class);
            startActivity(intent);
        });
        Kaj2.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity2.class);
            startActivity(intent);
        });
        Kaj3.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity3.class);
            startActivity(intent);
        });
        Kaj4.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity4.class);
            startActivity(intent);
        });
        Kaj5.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity5.class);
            startActivity(intent);
        });
        Kaj6.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity6.class);
            startActivity(intent);
        });
        Kaj7.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity8.class);
            startActivity(intent);
        });
        Kaj8.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity8.class);
            startActivity(intent);
        });
        Kaj9.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity9.class);
            startActivity(intent);
        });
        Kaj10.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity10.class);
            startActivity(intent);
        });
        Kaj11.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity11.class);
            startActivity(intent);
        });
        Kaj12.setOnClickListener( view -> {
            Intent intent = new Intent(this,Ka_Activity12.class);
            startActivity(intent);
        });




    }
}