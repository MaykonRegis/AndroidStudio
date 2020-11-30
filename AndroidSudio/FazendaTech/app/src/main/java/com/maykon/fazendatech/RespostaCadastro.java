package com.maykon.fazendatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RespostaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_cadastro);
    }

    public  void Login(View view){
        //startActivity(new Intent(MainActivity.this, TelaCadastro.class)); // PARA QUANDO CLICAR IR PARA A TELA SEGUINTE
        startActivity(new Intent(RespostaCadastro.this, MainActivity.class));
    }

    public void Loja(View view){
        startActivity(new Intent(RespostaCadastro.this, Produtos.class));
    }
}