package com.maykon.fazendatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Produtos extends AppCompatActivity {
        TextView editLaranja;
        TextView editLeite;
        TextView editMel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        editLaranja = findViewById(R.id.Laranja);
        editLeite = findViewById(R.id.Leite);
        editMel = findViewById(R.id.Mel);

    }

    public void carrinho(View view){
        //double Email = Double.parseDouble(editEmail.getText().toString());
        double Laranja = Double.parseDouble(editLaranja.getText().toString());
        double Leite = Double.parseDouble(editLeite.getText().toString());
        double Mel = Double.parseDouble(editMel.getText().toString());
        startActivity(new Intent(Produtos.this, Carrinho.class));
    }
}