package com.example.beautyproducts;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Registration_Activity extends AppCompatActivity {
    Button btn1;
    FirebaseAuth mAuth;
    EditText Eedt, Aedt;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        mAuth = FirebaseAuth.getInstance();
        btn1 = findViewById(R.id.btn1);
        Eedt = findViewById(R.id.edtPass);
        Aedt = findViewById(R.id.edtEmail);

        btn1.setOnClickListener(view -> {
            String emails = Aedt.getText().toString().trim();
            String passs = Eedt.getText().toString().trim();
            if (isValidEmail(emails) && validatePassword()) {
                Toast.makeText(this, "Valid email", Toast.LENGTH_SHORT).show();
                mAuth.createUserWithEmailAndPassword(emails, passs)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d("MSG", "createUserWithEmail:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Intent intent = new Intent(Registration_Activity.this, MainActivity.class);
                                    startActivity(intent);
                                    //updateUI(user);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w("", "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(Registration_Activity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                    //updateUI(null);
                                }
                            }
                        });
            }

        });
    }

    public final static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    private boolean validatePassword() {
        String passwordInput = Aedt.getText().toString().trim();

        if (passwordInput.isEmpty()) {
            Aedt.setError("Password cannot be empty");
            return false;
        } else {
            // Clear any previous errors if the field is now valid
            Aedt.setError(null);
            return true;
        }
    }
}

