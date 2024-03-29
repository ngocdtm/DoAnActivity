package com.example.doanactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;



public class MainActivity extends AppCompatActivity {
    BottomNavigationView nav;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nav = findViewById(R.id.bottomNavigation);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
             if (id == R.id.profile) {
                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(intent);

                    return true;

                }
                 else if (id == R.id.home) {
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);

                    return true;

                }
                return true;
            }



        });


    }






}