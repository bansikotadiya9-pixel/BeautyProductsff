package com.example.beautyproducts;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Foundation_Activity extends AppCompatActivity {
    ImageView Fo1,Fo2,Fo3,Fo4,Fo5,Fo6,Fo7,Fo8,Fo9,Fo10,Fo11,Fo12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_foundation);
        Fo1=findViewById(R.id.Fou1);
        Fo2=findViewById(R.id.Fou2);
        Fo3=findViewById(R.id.Fou3);
        Fo4=findViewById(R.id.Fou4);
        Fo5=findViewById(R.id.Fou5);
        Fo6=findViewById(R.id.Fou6);
        Fo7=findViewById(R.id.Fou7);
        Fo8=findViewById(R.id.Fou8);
        Fo9=findViewById(R.id.Fou9);
        Fo10=findViewById(R.id.Fou10);
        Fo11=findViewById(R.id.Fou11);
        Fo12=findViewById(R.id.Fou12);

        Fo1.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity1.class);
            startActivity(intent);
        });
        Fo2.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity2.class);
            startActivity(intent);
        });
        Fo3.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity3.class);
            startActivity(intent);
        });
        Fo4.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity4.class);
            startActivity(intent);
        });
        Fo5.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity5.class);
            startActivity(intent);
        });
        Fo6.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity6.class);
            startActivity(intent);
        });
        Fo7.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity7.class);
            startActivity(intent);
        });
        Fo8.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity8.class);
            startActivity(intent);
        });
        Fo9.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity9.class);
            startActivity(intent);
        });
        Fo10.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity10.class);
            startActivity(intent);
        });
        Fo11.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity11.class);
            startActivity(intent);
        });
        Fo12.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foun_Activity12.class);
            startActivity(intent);
        });

    }
}