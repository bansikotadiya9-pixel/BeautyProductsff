package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Mochuraizer_Activity extends AppCompatActivity {
    ImageView m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mochuraizer);
        m1=findViewById(R.id.Moc1);
        m2=findViewById(R.id.Moc2);
        m3=findViewById(R.id.Moc3);
        m4=findViewById(R.id.Moc4);
        m5=findViewById(R.id.Moc5);
        m6=findViewById(R.id.Moc6);
        m7=findViewById(R.id.Moc7);
        m8=findViewById(R.id.Moc8);
        m9=findViewById(R.id.Moc9);
        m10=findViewById(R.id.Moc10);
        m11=findViewById(R.id.Moc11);
        m12=findViewById(R.id.Moc12);
        m1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity1.class);
            startActivity(intent);
        });
        m2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity2.class);
            startActivity(intent);
        });
        m3.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity3.class);
            startActivity(intent);
        });
        m4.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity4.class);
            startActivity(intent);
        });
        m5.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity5.class);
            startActivity(intent);
        });
        m6.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity6.class);
            startActivity(intent);
        });
        m7.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity7.class);
            startActivity(intent);
        });
        m8.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity8.class);
            startActivity(intent);
        });
        m9.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity9.class);
            startActivity(intent);
        });
        m10.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity10.class);
            startActivity(intent);
        });
        m11.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity11.class);
            startActivity(intent);
        });
        m12.setOnClickListener(view -> {
            Intent intent = new Intent(this,Moch_Activity12.class);
            startActivity(intent);
        });



    }
}