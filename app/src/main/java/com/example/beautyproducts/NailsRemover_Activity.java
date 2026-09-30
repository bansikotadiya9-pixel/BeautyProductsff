package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NailsRemover_Activity extends AppCompatActivity {
    ImageView NR1,NR2,NR3,NR4,NR5,NR6,NR7,NR8,NR9,NR10,NR11,NR12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nails_remover);
        NR1=findViewById(R.id.Nr1);
        NR2=findViewById(R.id.Nr2);
        NR3=findViewById(R.id.Nr3);
        NR4=findViewById(R.id.Nr4);
        NR5=findViewById(R.id.Nr5);
        NR6=findViewById(R.id.Nr6);
        NR7=findViewById(R.id.Nr7);
        NR8=findViewById(R.id.Nr8);
        NR9=findViewById(R.id.Nr9);
        NR10=findViewById(R.id.Nr10);
        NR11=findViewById(R.id.Nr11);
        NR12=findViewById(R.id.Nr12);

        NR1.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity1.class);
            startActivity(intent);
        });
        NR2.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity2.class);
            startActivity(intent);
        });
        NR3.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity3.class);
            startActivity(intent);
        });
        NR4.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity4.class);
            startActivity(intent);
        });
        NR5.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity5.class);
            startActivity(intent);
        });
        NR6.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity6.class);
            startActivity(intent);
        });
        NR7.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity7.class);
            startActivity(intent);
        });
        NR8.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity8.class);
            startActivity(intent);
        });
        NR9.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity9.class);
            startActivity(intent);
        });
        NR10.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity10.class);
            startActivity(intent);
        });
        NR11.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity11.class);
            startActivity(intent);
        });
        NR12.setOnClickListener(view -> {
            Intent intent = new Intent(this,NR_Activity12.class);
            startActivity(intent);
        });



    }
}