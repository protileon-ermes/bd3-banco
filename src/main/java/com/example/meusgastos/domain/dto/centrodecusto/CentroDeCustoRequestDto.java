package com.example.meusgastos.domain.dto.centrodecusto;

public class CentroDeCustoRequestDto {
    private String descricao;
    private String observacao;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
