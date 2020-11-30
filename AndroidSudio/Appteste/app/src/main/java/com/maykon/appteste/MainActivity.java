package com.maykon.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void enviar(View view){
        EditText campoNome = findViewById(R.id.editNome);
        EditText campoEmail = findViewById(R.id.editEmail);
        TextView textoResultado = findViewById(R.id.textResultado);

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();


        textoResultado.setText("Nome " + nome + " \nEmail " + email);

    }

    
}