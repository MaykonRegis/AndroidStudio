package com.example.android.dicionariox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numero = (TextView) findViewById(R.id.numeros);
        numero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numerosIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numerosIntent);
            }
        });

        TextView cores = (TextView) findViewById(R.id.cores);
        cores.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent coresIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(coresIntent);
            }
        });

    }
}
