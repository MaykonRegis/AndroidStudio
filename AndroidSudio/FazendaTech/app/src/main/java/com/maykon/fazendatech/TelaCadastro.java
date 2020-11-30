package com.maykon.fazendatech;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastro extends AppCompatActivity {
    private EditText editNome;
    private EditText editEmail;
    private EditText editSenha;
    private EditText editEndereco;
    private EditText editCelular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        editNome = findViewById(R.id.Nome);
        editEmail = findViewById(R.id.Email);
        editSenha = findViewById(R.id.Senha);
        editEndereco = findViewById(R.id.Endereco);
        editCelular = findViewById(R.id.Celular);



    }

    public void Cadastrar(View view){
        //startActivity(new Intent(MainActivity.this, TelaCadastro.class)); // PARA QUANDO CLICAR IR PARA A TELA SEGUINTE
        startActivity(new Intent(TelaCadastro.this, RespostaCadastro.class));

        validarCampos();

    }

    public void Login(View view){
        startActivity(new Intent(TelaCadastro.this, MainActivity.class));
    }

    private void validarCampos(){
        //capturando so campos
        String nome = editNome.getText().toString();
        String email = editEmail.getText().toString();
        String endereco = editEndereco.getText().toString();
        String senha = editSenha.getText().toString();
        String celular = editCelular.getText().toString();

        boolean res = false;

        if(res = isCampoVazio(nome)){
            editNome.requestFocus();
        }else if(res = !isEmailValido(email)){
            editEmail.requestFocus();
        }else if(res = isEmailValido(senha)){
            editSenha.requestFocus();
        }else if(res = isCampoVazio(endereco)){
            editEndereco.requestFocus();
        }else if(res = isCampoVazio(celular)){
            editCelular.requestFocus();
        }
        if(res){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle(R.string.tittle_aviso);
            dlg.setMessage(R.string.msg_campos_invalidos); //
            dlg.setNeutralButton("Ok",null);
            dlg.show();
        }
    }

    //VALIDANDO SE OS CAMPOS ESTÁ VAZIO
    private boolean isCampoVazio(String valor){
        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return resultado;
    }
    //VERIFICANDO SE O EMAIL ESTA VAZIO MAIS SE O EMAIL E VALIDO
    private boolean isEmailValido(String email){
        boolean resultado = (!isCampoVazio(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
        return resultado;
    }











}