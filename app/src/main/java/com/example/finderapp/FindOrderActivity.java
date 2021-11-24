package com.example.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finderapp.services.OrderServices;

public class FindOrderActivity extends AppCompatActivity {
    private OrderServices correiosServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.correiosServices = new OrderServices();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_order);

        //correiosServices.getPackageList("LX002249507BR");
    }
}