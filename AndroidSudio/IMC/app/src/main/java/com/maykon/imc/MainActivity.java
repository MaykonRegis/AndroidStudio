package com.maykon.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.Peso);
        editAltura = findViewById(R.id.Altura);
        textResultado = findViewById(R.id.TextResultado);
    }

    public void CalcularImc(View view){
        double Peso = Double.parseDouble(editPeso.getText().toString());
        double Altura = Double.parseDouble(editAltura.getText().toString());
        double imc = Peso / (Altura * Altura);
        if(imc <= 18.5){
            textResultado.setText("Voçe está com Magreza");
        }else if(imc > 18.5 && imc < 25.9){
            textResultado.setText("Voçe esta Normal");
        }else if(imc > 25.9 && imc < 29.9){
            textResultado.setText("Voçe esta com Sobrepeso");
        }else if(imc > 30 && imc < 39.9){
            textResultado.setText("Voçe está com Obesidade");
        }else if(imc > 40){
            textResultado.setText("Voçe está com Obesidade Grave");
        }
    }
}