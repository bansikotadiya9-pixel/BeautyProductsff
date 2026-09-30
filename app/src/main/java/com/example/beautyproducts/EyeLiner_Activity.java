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

public class EyeLiner_Activity extends AppCompatActivity {
    ImageView ey1,ey2,ey3,ey4,ey5,ey6,ey7,ey8,ey9,ey10,ey11,ey12;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eye_liner);
        ey1=findViewById(R.id.ey1);
        ey2=findViewById(R.id.ey2);
        ey3=findViewById(R.id.ey3);
        ey4=findViewById(R.id.ey4);
        ey5=findViewById(R.id.ey5);
        ey6=findViewById(R.id.ey6);
        ey7=findViewById(R.id.ey7);
        ey8=findViewById(R.id.ey8);
        ey9=findViewById(R.id.ey9);
        ey10=findViewById(R.id.ey10);
        ey11=findViewById(R.id.ey11);
        ey12=findViewById(R.id.ey12);

        ey1.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity1.class);
            startActivity(intent);
        });
        ey2.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity2.class);
            startActivity(intent);
        });
        ey3.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity3.class);
            startActivity(intent);
        });
        ey4.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity4.class);
            startActivity(intent);
        });
        ey5.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity5.class);
            startActivity(intent);
        });
        ey6.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity6.class);
            startActivity(intent);
        });
        ey7.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity7.class);
            startActivity(intent);
        });
        ey8.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity8.class);
            startActivity(intent);
        });
        ey9.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity9.class);
            startActivity(intent);
        });
        ey10.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity10.class);
            startActivity(intent);
        });
        ey11.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity11.class);
            startActivity(intent);
        });
        ey12.setOnClickListener( view -> {
            Intent intent = new Intent(this,Eline_Activity12.class);
            startActivity(intent);
        });








    }
}