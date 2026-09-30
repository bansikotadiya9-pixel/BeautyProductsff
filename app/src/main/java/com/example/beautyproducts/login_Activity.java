package com.example.beautyproducts;

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
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.checkerframework.checker.nullness.qual.NonNull;

public class login_Activity extends AppCompatActivity {
    Button btn;
    FirebaseAuth mAuth;
    EditText edt1,edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        btn=findViewById(R.id.btn1);
        btn.setOnClickListener(view -> {
            String emails=edt1.getText().toString();
            String passs=edt2.getText().toString();
            if (isValidEmail(emails) && validatePassword()) {
                Toast.makeText(this, "Valid email", Toast.LENGTH_SHORT).show();

                mAuth.signInWithEmailAndPassword(emails,passs)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d("MSG", "createUserWithEmail:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    Intent intent = new Intent(login_Activity.this,MainActivity.class);
                                    startActivity(intent);
                                    //updateUI(user);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w("", "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(login_Activity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(login_Activity.this,Registration_Activity.class);
                                    startActivity(intent);
                                    //updateUI(null);
                                }
                            }
                        });
            } else {
                edt1.setError("Invalid email address");
                edt1.requestFocus();
                edt2.setError("Password cannot be empty");
            }
        });
    }
    public final static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
    private boolean validatePassword() {
        String passwordInput = edt2.getText().toString().trim();

        if (passwordInput.isEmpty()) {
            edt2.setError("Password cannot be empty");
            return false;
        } else {
            // Clear any previous errors if the field is now valid
            edt2.setError(null);
            return true;
        }
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(this,MainActivity.class);
           startActivity(intent);
        }
    }

}