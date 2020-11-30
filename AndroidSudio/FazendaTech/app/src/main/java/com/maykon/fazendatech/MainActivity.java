package com.maykon.fazendatech;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText editEmail;
    private EditText editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.Email);
        editSenha = findViewById(R.id.Senha);


    }

    public  void Entrar(View view){
        double Email = Double.parseDouble(editEmail.getText().toString());
        double Senha = Double.parseDouble(editSenha.getText().toString());                                                 // COMANDO EQUALS VERIFICA SE E IGUAL
        if(editEmail.getText().toString().equals("Maykon.bea@hotmail.com") && editSenha.getText().toString().equals("123")){ // COMANDO PARA VALIDAR
            startActivity(new Intent(MainActivity.this, TelaSeguinte.class)); // PARA DIRECIONAR PARA A SEGUNDA TELA
        }else {
            Toast.makeText(this, "Usuario ou Senha Invalido", Toast.LENGTH_SHORT).show();
        }
    }
    public void Cadastrar(View view){
        startActivity(new Intent(MainActivity.this, TelaCadastro.class)); // PARA QUANDO CLICAR IR PARA A TELA SEGUINTE
    }

    public void Loja(View view){
        startActivity(new Intent(MainActivity.this, Carrinho.class));
    }
}