package com.example.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.finderapp.models.Event;
import com.example.finderapp.models.RastreioAdapter;
import com.example.finderapp.services.OrderServices;

import java.util.Collections;
import java.util.List;

public class FindOrderActivity extends AppCompatActivity {
    private OrderServices correiosServices;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.correiosServices = new OrderServices();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_order);

        //correiosServices.getPackageList("LX002249507BR");



    }
    private void adicionarEncomenda(){

    }
    private void persquisarEncomenda(){
        carregarLista();
    }
    private void carregarLista() {
        listView = findViewById(R.id.listView);
        listView.setAdapter(new RastreioAdapter((List<Event>) new Event(),this));
    }
}