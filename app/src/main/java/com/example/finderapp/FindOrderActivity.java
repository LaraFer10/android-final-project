package com.example.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.finderapp.models.Event;
import com.example.finderapp.models.Order;
import com.example.finderapp.models.RastreioAdapter;
import com.example.finderapp.services.OrderServices;

import java.util.List;

public class FindOrderActivity extends AppCompatActivity {
    private OrderServices correiosServices;
    private Button btnPesquisar;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.correiosServices = new OrderServices();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_order);

        btnPesquisar = findViewById(R.id.btnPesquisar);
        btnPesquisar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                persquisarEncomenda(v);
            }
        });

    }

    public void persquisarEncomenda(View view){
        EditText edtCodigo = (EditText) findViewById(R.id.editCodigo);
        String codigo = edtCodigo.getText().toString();
        Order order = correiosServices.getPackageList(codigo);
        carregarLista(order.getEvents());
    }

    private void adicionarEncomenda(){

    }

    private void carregarLista(List<Event> event) {
        listView = findViewById(R.id.listView);
        listView.setAdapter(new RastreioAdapter(event,this));
    }
}