package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Highlighter_Activity extends AppCompatActivity {
    ImageView Hi1,Hi2,Hi3,Hi4,Hi5,Hi6,Hi7,Hi8,Hi9,Hi10,Hi11,Hi12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_highlighter);
        Hi1=findViewById(R.id.Hi1);
        Hi2=findViewById(R.id.Hi2);
        Hi3=findViewById(R.id.Hi3);
        Hi4=findViewById(R.id.Hi4);
        Hi5=findViewById(R.id.Hi5);
        Hi6=findViewById(R.id.Hi6);
        Hi7=findViewById(R.id.Hi7);
        Hi8=findViewById(R.id.Hi8);
        Hi9=findViewById(R.id.Hi9);
        Hi10=findViewById(R.id.Hi10);
        Hi11=findViewById(R.id.Hi11);
        Hi12=findViewById(R.id.Hi12);
        Hi1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity1.class);
            startActivity(intent);
        });
        Hi2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity2.class);
            startActivity(intent);
        });
        Hi3.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity3.class);
            startActivity(intent);
        });
        Hi4.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity4.class);
            startActivity(intent);
        });
        Hi5.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity5.class);
            startActivity(intent);
        });
        Hi6.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity6.class);
            startActivity(intent);
        });
        Hi7.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity7.class);
            startActivity(intent);
        });
        Hi8.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity8.class);
            startActivity(intent);
        });
        Hi9.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity9.class);
            startActivity(intent);
        });
        Hi10.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity10.class);
            startActivity(intent);
        });
        Hi11.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity11.class);
            startActivity(intent);
        });
        Hi12.setOnClickListener(view -> {
            Intent intent = new Intent(this,Hig_Activity12.class);
            startActivity(intent);
        });


    }
}