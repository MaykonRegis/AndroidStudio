package com.example.android.dicionariox;

public class Word {
    private String mPortugues;
    private String mTradIngles;
    private int mIdImagem = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String portugues, String tradIngles) {
        mPortugues = portugues;
        mTradIngles = tradIngles;
    }

    public Word(String portugues, String tradIngles, int idImagem) {
        mPortugues = portugues;
        mTradIngles = tradIngles;
        mIdImagem = idImagem;
    }

    public String getPortugues(){
        return mPortugues;
    }

    public String getTradIngles() {
        return mTradIngles;
    }

    public int getIdImagem() {
        return mIdImagem;
    }

    public boolean hasImage() {return mIdImagem != NO_IMAGE_PROVIDED;}
}
