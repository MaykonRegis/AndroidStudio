package com.example.android.dicionariox;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    /**
     * Construtor adaptado.
     * o contexto é utilizado para "inflar" o layout .xml, e a lista são os dados que queremos inserir na view.
     * o terceiro parâmetro informa a cor padrão da categoria que chama o adaptador
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    //Ctrl+O para encontrar um metodo para sobrescrever
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Confere se a view existente está sendo usada. Caso contrário, "infla" a view com novos dados.
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);
        }

        // Retorna o objeto localizado na posição
        Word currentWord = getItem(position);

        // Encontra a textView do nome em inglês no layout item_lista.xml
        TextView inglesTextView = (TextView) listItemView.findViewById(R.id.ingles_text_view);
        // Traz a palavra em inglês armazenada no objeto Word encontrado anteriormente
        // coloca a palavra na textview TextView
        inglesTextView.setText(currentWord.getTradIngles());


        TextView portuguesTextView = (TextView) listItemView.findViewById(R.id.portugues_text_view);
        portuguesTextView.setText(currentWord.getPortugues());



        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imagem);

        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getIdImagem());
            iconView.setVisibility(View.VISIBLE);
        }
        else
            iconView.setVisibility(View.GONE);



        // Coloca a cor da categoria no item de lista
        View textContainer = listItemView.findViewById(R.id.container_texto);
        // Encontra a cor que está mapeada para a categoria de acorod com o ID
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Define a cor de fundo da View container
        textContainer.setBackgroundColor(color);

        // Retorna o layout de item de lista completo (contendo 2 TextViews e 1 ImageView)
        // para que possam ser exibidos na ListView
        return listItemView;

    }
}
