package com.example.beautyproducts;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    CardView Car_Bra,Car_Com,Car_Fou,Car_Ka,Car_Shd,Car_EyLi,Car_Lb,Car_Ls,Car_lLine,Car_Moc,Car_Pri,Car_Nail,Car_Np,Car_Nr,Car_Hig;
    TextView Man;
    FirebaseAuth mAuth;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        Car_Bra=findViewById(R.id.Car_Brs);
        Car_Com=findViewById(R.id.Car_Com);
        Car_Fou=findViewById(R.id.Car_Fou);
        Car_Ka=findViewById(R.id.Car_Ka);
        Car_Shd=findViewById(R.id.Car_Shd);
        Car_EyLi=findViewById(R.id.Car_EyLi);
        Car_Lb=findViewById(R.id.Car_Lb);
        Car_Ls=findViewById(R.id.Car_Ls);
        Car_lLine=findViewById(R.id.Car_lLine);
        Car_Moc=findViewById(R.id.Car_Moc);
        Car_Pri=findViewById(R.id.Car_Pri);
        Car_Nail=findViewById(R.id.Car_Nail);
        Car_Np=findViewById(R.id.Car_Np);
        Car_Nr=findViewById(R.id.Car_Nr);
        Car_Hig=findViewById(R.id.Car_Hig);
        Man=findViewById(R.id.Man);
        Car_Bra.setOnClickListener(view -> {
            Intent intent = new Intent(this,Brush_Activity.class);
            startActivity(intent);
        });
        Car_Com.setOnClickListener(view -> {
            Intent intent = new Intent(this,CompactActivity.class);
            startActivity(intent);
        });
        Car_Fou.setOnClickListener(view -> {
            Intent intent = new Intent(this,Foundation_Activity.class);
            startActivity(intent);
        });
        Car_Ka.setOnClickListener(view -> {
            Intent intent = new Intent(this,Kajal_Activity.class);
            startActivity(intent);
        });
        Car_Shd.setOnClickListener(view -> {
            Intent intent = new Intent(this,EyeShadow_Activity.class);
            startActivity(intent);
        });
        Car_EyLi.setOnClickListener(view -> {
            Intent intent = new Intent(this,EyeLiner_Activity.class);
            startActivity(intent);
        });
        Car_Lb.setOnClickListener(view -> {
            Intent intent = new Intent(this,LipBalm_Activity.class);
            startActivity(intent);
        });
        Car_Ls.setOnClickListener(view -> {
            Intent intent = new Intent(this,Liptick_Activity.class);
            startActivity(intent);
        });
        Car_lLine.setOnClickListener(view -> {
            Intent intent = new Intent(this, LipLiner_Activity.class);
            startActivity(intent);
        });
        Car_Moc.setOnClickListener(view -> {
            Intent intent = new Intent(this,Mochuraizer_Activity.class);
            startActivity(intent);
        });
        Car_Pri.setOnClickListener(view -> {
            Intent intent = new Intent(this,Primer_Activity.class);
            startActivity(intent);
        });

        Car_Nail.setOnClickListener(view -> {
            Intent intent = new Intent(this,Nails_Activity.class);
            startActivity(intent);
        });
        Car_Np.setOnClickListener(view -> {
            Intent intent = new Intent(this,NailsPolis_Activity.class);
            startActivity(intent);
        });
        Car_Nr.setOnClickListener(view -> {
            Intent intent = new Intent(this,NailsRemover_Activity.class);
            startActivity(intent);
        });
        Car_Hig.setOnClickListener(view -> {
            Intent intent = new Intent(this,Highlighter_Activity.class);
            startActivity(intent);
        });
        Man.setOnClickListener(view -> {
            mAuth.signOut();
            FirebaseUser currentUser = mAuth.getCurrentUser();
            if(currentUser == null){
                Intent intent = new Intent(this,login_Activity.class);
                startActivity(intent);
            }
        });
    }
}