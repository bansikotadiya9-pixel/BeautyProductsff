package com.example.beautyproducts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pay_Activity extends AppCompatActivity {

    TextView txtBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pay);

        txtBuy=findViewById(R.id.txtBuy);

        txtBuy.setOnClickListener(view -> {
            Intent intent=new Intent(this, Oder_Confirm.class);
            startActivity(intent);
        });

    }
}