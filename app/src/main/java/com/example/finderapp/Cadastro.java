package com.example.finderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finderapp.R;
import com.example.finderapp.models.User;

public class Cadastro extends AppCompatActivity {
    private EditText nome, senha, email, confirmSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cadastro);
        nome = (EditText) findViewById(R.id.Name);
        senha = (EditText) findViewById(R.id.Senha);
        email = (EditText) findViewById(R.id.Email);
        confirmSenha = (EditText) findViewById(R.id.confirmSenha);
    }

    public void cadastrar(View view) {
        if (senha.getText().toString().equals(confirmSenha.getText().toString())) {
            User u = pegarUsuario();
            if (u.getEmail().equals("") && u.getName().equals("") && u.getPassword().equals("")){
                Toast.makeText(getApplicationContext(),"Alguns campos estão vazios",
                        Toast.LENGTH_SHORT).show();
            } else {
                //TODO adicionar no banco de dados
                //TODO logar no sistema
                //TODO trocar activity para tela principal
            }
        } else {
            Toast.makeText(getApplicationContext(),"Senhas não batem",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void trocarPraLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    private User pegarUsuario() {
        User u = new User(nome.getText().toString(),
                          senha.getText().toString(),
                          email.getText().toString());
        return u;
    }
}