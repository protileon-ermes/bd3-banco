package com.example.meusgastos.domain.Enum;

public enum EtipoTitulo {
    ARECEBER("a receber"),
    APAGAR("a pagar");

    private String valor;
    private EtipoTitulo(String valor) {
        this.valor=valor;
    }

    public String getValor() {
        return this.valor;
    }
}
