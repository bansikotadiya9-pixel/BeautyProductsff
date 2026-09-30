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

public class LipBalm_Activity extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lip_balm);
        i1=findViewById(R.id.Lb1);
        i2=findViewById(R.id.Lb2);
        i3=findViewById(R.id.Lb3);
        i4=findViewById(R.id.Lb4);
        i5=findViewById(R.id.Lb5);
        i6=findViewById(R.id.Lb6);
        i7=findViewById(R.id.Lb7);
        i8=findViewById(R.id.Lb8);
        i9=findViewById(R.id.Lb9);
        i10=findViewById(R.id.Lb10);
        i11=findViewById(R.id.Lb11);
        i12=findViewById(R.id.Lb12);

        i1.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity1.class);
            startActivity(intent);
        });
        i2.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity2.class);
            startActivity(intent);
        });
        i3.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity3.class);
            startActivity(intent);
        });
        i4.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity4.class);
            startActivity(intent);
        });
        i5.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity5.class);
            startActivity(intent);
        });
        i6.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity6.class);
            startActivity(intent);
        });
        i7.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity7.class);
            startActivity(intent);
        });
        i8.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity8.class);
            startActivity(intent);
        });
        i9.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity9.class);
            startActivity(intent);
        });
        i10.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity10.class);
            startActivity(intent);
        });
        i11.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity11.class);
            startActivity(intent);
        });
        i12.setOnClickListener(view -> {
            Intent intent = new Intent(this,LB_Activity12.class);
            startActivity(intent);
        });




    }
}