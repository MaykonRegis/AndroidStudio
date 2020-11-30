package com.example.android.dicionarioxbeta1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Cria uma lista de palavras
        ArrayList<String> words = new ArrayList<String>();
        words.add("um");
        words.add("dois");
        words.add("três");
        words.add("quatro");
        words.add("cinco");
        words.add("seis");
        words.add("sete");
        words.add("oito");
        words.add("nove");
        words.add("dez");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        //AQUI CONSOME MAIS MEMORIA
        for (int index = 0; index < words.size(); index++) {
            // Cria uma nova TextView
            TextView wordView = new TextView(this);
            // Adiciona o texto da arraylist posição index na textview
            wordView.setText(words.get(index));
            wordView.setTextSize(20);
            // Adiciona o textview criada como filha do layout raiz
            rootView.addView(wordView);
        }


    }
}











