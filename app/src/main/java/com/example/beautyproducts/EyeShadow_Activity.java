package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EyeShadow_Activity extends AppCompatActivity {
    ImageView Es1,Es2,Es3,Es4,Es5,Es6,Es7,Es8,Es9,Es10,Es11,Es12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eye_shadow);
        Es1=findViewById(R.id.Esh1);
        Es2=findViewById(R.id.Esh2);
        Es3=findViewById(R.id.Esh3);
        Es4=findViewById(R.id.Esh4);
        Es5=findViewById(R.id.Esh5);
        Es6=findViewById(R.id.Esh6);
        Es7=findViewById(R.id.Esh7);
        Es8=findViewById(R.id.Esh8);
        Es9=findViewById(R.id.Esh9);
        Es10=findViewById(R.id.Esh10);
        Es11=findViewById(R.id.Esh11);
        Es12=findViewById(R.id.Esh12);

        Es1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity1.class);
            startActivity(intent);
        });
        Es2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity2.class);
            startActivity(intent);
        });
        Es3.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity3.class);
            startActivity(intent);
        });
        Es4.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity4.class);
            startActivity(intent);
        });
        Es5.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity5.class);
            startActivity(intent);
        });
        Es6.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity6.class);
            startActivity(intent);
        });
        Es7.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity7.class);
            startActivity(intent);
        });
        Es8.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity8.class);
            startActivity(intent);
        });
        Es9.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity9.class);
            startActivity(intent);
        });
        Es10.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity10.class);
            startActivity(intent);
        });
        Es11.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity11.class);
            startActivity(intent);
        });
        Es12.setOnClickListener(view -> {
            Intent intent = new Intent(this,Esh_Activity12.class);
            startActivity(intent);
        });

    }
}