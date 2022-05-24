package com.akaraol.bottomnavtestchess;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.akaraol.bottomnavtestchess.databinding.ActivityLoginScreenBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginScreenActivity extends AppCompatActivity {

    private ActivityLoginScreenBinding binding;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginScreenBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Çıkış Yapılmadığı Sürece Aynı Kullanıcıda Kalacak
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            Intent intent = new Intent(LoginScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();

        }

    }


    //Sign-In butonuna tıklatınca firebaseden kullanıcı çekecek
    public void signInClicked (View view) {
        String email = binding.usernameInput.getText().toString();
        String password = binding.pass.getText().toString();

        if (email.equals("") || password.equals("")) {

            Toast.makeText(this, "E-Mail veya Şifreniz Yanlış.", Toast.LENGTH_LONG).show();

        }
        else {
            mAuth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intent = new Intent(LoginScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                    Toast.makeText(LoginScreenActivity.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }

    }
//Sign up butonuna tıklayınca firebaseden kayıt açacak
    public void signUpClicked (View view) {

        String email = binding.usernameInput.getText().toString();
        String password = binding.pass.getText().toString();

        if (email.equals("") || password.equals("")) {

            Toast.makeText(this, "Lütfen E-Mail ve Şifrenizi Girin.", Toast.LENGTH_LONG).show();

        }
        else {
            mAuth.createUserWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {

                    Intent intent = new Intent(LoginScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }

            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(LoginScreenActivity.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }


    }
}