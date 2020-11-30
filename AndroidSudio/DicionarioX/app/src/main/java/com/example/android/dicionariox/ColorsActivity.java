package com.example.android.dicionariox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_view);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("vermelho", "red", R.drawable.color_red));
        words.add(new Word("azul", "blue", R.drawable.color_blue));
        words.add(new Word("verde", "green", R.drawable.color_green));

        WordAdapter adapter = new WordAdapter(this, words, R.color.cat_cores);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
