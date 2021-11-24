package com.example.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.finderapp.services.OrderServices;

public class MainActivity extends AppCompatActivity {

    private OrderServices orderServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.orderServices = new OrderServices();
        setTheme(R.style.Theme_FinderApp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                GetLoginActivity();
            }
        }, 2000);
    }

    private void GetLoginActivity() {
        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
        finish();
    }
}