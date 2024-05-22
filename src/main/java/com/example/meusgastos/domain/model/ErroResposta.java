package com.example.meusgastos.domain.model;

public class ErroResposta {
    private String dataHora;
    private Integer status;
    private String titulo;
    private String mensagem;
    
    public ErroResposta(String dataHora, Integer status, String titulo, String mensagem) {
        this.dataHora = dataHora;
        this.status = status;
        this.titulo = titulo;
        this.mensagem = mensagem;
    }

}
