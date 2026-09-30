package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Oder_Confirm extends AppCompatActivity {

    TextView txtOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oder_confirm);

        txtOrder=findViewById(R.id.txtOrder);

        txtOrder.setOnClickListener(view -> {
            Intent intent =new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}