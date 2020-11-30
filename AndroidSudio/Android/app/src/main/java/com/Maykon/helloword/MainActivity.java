package com.Maykon.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.alcool);
        editPrecoGasolina = findViewById(R.id.gasolina);
        textResultado = findViewById(R.id.textResultado);




    }

    public void calcularpreco(View view){
        double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString()); // VAI CONVERTE O EDITPRECOALCOOL EM NUMERO
        double  precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());
        double resultado = precoAlcool/precoGasolina;
        if(resultado >= 0.7){
            textResultado.setText("Melhor utilizar gasolina");
        }else {
            textResultado.setText("Melhor utilizar Alcool");
        }


    }
}