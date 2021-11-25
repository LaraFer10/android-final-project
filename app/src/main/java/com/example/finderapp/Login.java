package com.example.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finderapp.models.User;

public class Login extends AppCompatActivity {
    private EditText senha, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        senha = (EditText) findViewById(R.id.Senha);
        email = (EditText) findViewById(R.id.Email);
    }

    public void login(View view) {
        //TODO trocar a variavel "estaNoBanco" por um metodo que confirme se o
        // usuario esta no banco de dados usando "pegarUsuario()" como parametro
        boolean estaNoBanco = false;
        pegarUsuario();
        if (estaNoBanco) {
            //TODO logar no sistema
            //TODO trocar activity para tela principal
        } else {
            Toast.makeText(getApplicationContext(),"Email ou Senha Incorretos",
                           Toast.LENGTH_SHORT).show();
        }
    }

    public void trocarPraCadastro(View view) {
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

    private User pegarUsuario(){
        User u = new User("Place Holder",
                senha.getText().toString(),
                email.getText().toString());
        return u;
    }
}