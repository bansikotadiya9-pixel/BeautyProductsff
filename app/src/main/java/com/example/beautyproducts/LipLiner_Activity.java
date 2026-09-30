package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LipLiner_Activity extends AppCompatActivity {
    ImageView Lline1,Lline2,Lline3,Lline4,Lline5,Lline6,Lline7,Lline8,Lline9,Lline10,Lline11,Lline12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lip_liner);
        Lline1=findViewById(R.id.Ll1);
        Lline2=findViewById(R.id.Ll2);
        Lline3=findViewById(R.id.Ll3);
        Lline4=findViewById(R.id.Ll4);
        Lline5=findViewById(R.id.Ll5);
        Lline6=findViewById(R.id.Ll6);
        Lline7=findViewById(R.id.Ll7);
        Lline8=findViewById(R.id.Ll8);
        Lline9=findViewById(R.id.Ll9);
        Lline10=findViewById(R.id.Ll10);
        Lline11=findViewById(R.id.Ll11);
        Lline12=findViewById(R.id.Ll12);
        Lline1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity1.class);
            startActivity(intent);
        });
        Lline2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity2.class);
            startActivity(intent);
        });
        Lline3.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity3.class);
            startActivity(intent);
        });
        Lline4.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity4.class);
            startActivity(intent);
        });
        Lline5.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity5.class);
            startActivity(intent);
        });
        Lline6.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity6.class);
            startActivity(intent);
        });
        Lline7.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity7.class);
            startActivity(intent);
        });
        Lline8.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity8.class);
            startActivity(intent);
        });
        Lline9.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity9.class);
            startActivity(intent);
        });
        Lline10.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity10.class);
            startActivity(intent);
        });
        Lline11.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity11.class);
            startActivity(intent);
        });
        Lline12.setOnClickListener(view -> {
            Intent intent = new Intent(this,Lline_Activity12.class);
            startActivity(intent);
        });

    }
}