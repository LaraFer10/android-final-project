package br.ucsal.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import br.ucsal.finderapp.services.CorreiosServices;

public class FindOrderActivity extends AppCompatActivity {
    private CorreiosServices correiosServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.correiosServices = new CorreiosServices();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_order);

        correiosServices.getPackageList("LX002249507BR");
    }
}