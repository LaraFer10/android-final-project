package com.example.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finderapp.services.OrderServices;

public class MainActivity extends AppCompatActivity {

    private OrderServices orderServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.orderServices = new OrderServices();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orderServices.getPackageList("LX002249507BR");
    }
}