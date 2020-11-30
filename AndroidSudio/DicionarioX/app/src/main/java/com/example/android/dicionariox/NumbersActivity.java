package com.example.android.dicionariox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_view);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("um", "one", R.drawable.number_one));
        words.add(new Word("dois", "two", R.drawable.number_two));
        words.add(new Word("três", "three", R.drawable.number_three));
        words.add(new Word("quatro", "four", R.drawable.number_four));
        words.add(new Word("cinco", "five", R.drawable.number_five));
        words.add(new Word("seis", "six", R.drawable.number_six));
        words.add(new Word("sete", "seven", R.drawable.number_seven));
        words.add(new Word("oito", "eight", R.drawable.number_eight));
        words.add(new Word("nove", "nine", R.drawable.number_nine));
        words.add(new Word("dez", "ten", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.cat_numeros);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
