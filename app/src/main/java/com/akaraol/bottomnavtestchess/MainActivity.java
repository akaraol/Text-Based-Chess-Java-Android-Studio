package com.akaraol.bottomnavtestchess;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        //Fragment değiştirme kodalrı
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this, R.id.fragment);

        //Fragment değiştirdikçe ekranın üst kısmındaki yazıları değiştiriyor.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);


        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }

    //Menuyu oluşturduk
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.sig_out) {
                //Sign-Out


            Intent intentToLogin = new Intent(MainActivity.this, LoginScreenActivity.class);
            startActivity(intentToLogin);
            finish();



        }

        return super.onOptionsItemSelected(item);
    }

    public void signInClicked(View view) {
    }

    public void signUpClicked(View view) {
    }

    public void exitClicked (View view) {

        mAuth.signOut();

        Intent intentToExit = new Intent(MainActivity.this, LoginScreenActivity.class);
        startActivity(intentToExit);
        finish();

    }
}

