package com.example.android.dicionarioxbeta2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.dicionarioxbeta2.NumbersActivity;
import com.example.android.dicionarioxbeta2.R;

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
    }


}