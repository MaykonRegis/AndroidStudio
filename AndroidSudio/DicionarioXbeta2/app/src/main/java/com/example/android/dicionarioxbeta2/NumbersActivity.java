package com.example.android.dicionarioxbeta2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
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
        //OCUPA MENOS ESPAÇO
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
























/*ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);*/