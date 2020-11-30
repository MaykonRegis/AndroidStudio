package com.example.android.hamburgueriay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantidade = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view){
        quantidade = quantidade + 1;
        displayQuantidade(quantidade);
    }

    public void subtrair(View view){
        quantidade = quantidade - 1;
        displayQuantidade(quantidade);
    }

    public void displayQuantidade(int qtdHamburguer){
        TextView qtdTextview = (TextView) findViewById(R.id.quantidade_tv);
        qtdTextview.setText("" + qtdHamburguer);
    }
}