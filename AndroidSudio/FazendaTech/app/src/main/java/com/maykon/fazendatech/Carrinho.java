package com.maykon.fazendatech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Carrinho extends AppCompatActivity {
    int quantidade = 0;
    int preco = 7;
    int precoFinal;
    int resultado;

    TextView editpreco;
    TextView pedido;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);

        //nome = findViewById(R.id.nomeProduto);
        editpreco = findViewById(R.id.preco);


        pedido = findViewById(R.id.resultadoPreco);
       // preco = findViewById(R.id.preco);
    }

    // FUNCAO DO BOTOES
    public void somar(View view){
       quantidade = quantidade + 1;
       displayQuantidade(quantidade);
    }

    public void subtrair(View view){
      quantidade = quantidade - 1;
      displayQuantidade(quantidade);
    }



    public void displayQuantidade(int qtdPedido){
        TextView qtdTextView = (TextView) findViewById(R.id.quantidade_tv);
        qtdTextView.setText("" + qtdPedido);
    }

    //FUNCAO DOS BOTOTES

    public void finalizarPedido(View view){
      TextView nome = (TextView) findViewById(R.id.nomeProduto);
      TextView resumo = (TextView) findViewById(R.id.resultadoPreco) ;

      double precoFinal = preco * quantidade;

      String msg = "Nome " + nome;
      msg += "Quantidade " + quantidade;
      msg += "Valor " + precoFinal;

      resumo.setText(msg);

      Intent intent = new Intent(Intent.ACTION_SENDTO);
      intent.setData(Uri.parse("mailto"));
      intent.putExtra(Intent.EXTRA_SUBJECT, "Pedido de " + nome);
      intent.putExtra(Intent.EXTRA_TEXT, msg);
      if(intent.resolveActivity(getPackageManager())!= null){
          startActivity(intent);
      }
    }



}