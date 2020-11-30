package com.maykon.contagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textResultado;
    EditText editNome, editInicio, editFim, editPasso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editNome = findViewById(R.id.editNome);
        editInicio = findViewById(R.id.editInicio);
        editFim = findViewById(R.id.editFim);
        editPasso = findViewById(R.id.editPasso);

    }

    public void contar(View view){
        calcular();
    }

    public void calcular(){
        String nome = editNome.getText().toString();

        int inicio = Integer.parseInt(editInicio.getText().toString());
        int fim = Integer.parseInt(editFim.getText().toString());
        int passo = Integer.parseInt(editPasso.getText().toString());
        textResultado.setText(" Sr: " + nome);

        for(int c = inicio; c <= fim; c += passo){
            textResultado.append("\n" + c);
        }



    }


}