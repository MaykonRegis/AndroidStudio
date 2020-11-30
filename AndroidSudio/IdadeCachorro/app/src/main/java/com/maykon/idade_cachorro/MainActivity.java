package com.maykon.idade_cachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idade;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade = findViewById(R.id.idade);
        resultado = findViewById(R.id.resultado);
    }

    public void Calcular(View view){
        int Idade = Integer.parseInt(idade.getText().toString()); // converte para inteiro
        int Resultado = Idade*7;
        resultado.setText("Idade igual a: " + Resultado);
    }
}