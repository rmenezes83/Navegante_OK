package com.projeto.senac.navegante;

public class Embarcacao {

    private String DuracaoViagem, EnderecoPorto, FonePorto, Horarios, NomeEmbarcacao, NomeEmpresa, NomePorto, TipoEmbarcacao, imagem;

    public Embarcacao(){

    }

    public Embarcacao(String duracaoViagem, String enderecoPorto, String fonePorto, String horarios, String nomeEmbarcacao, String nomeEmpresa, String nomePorto, String tipoEmbarcacao, String imagem) {
        DuracaoViagem = duracaoViagem;
        EnderecoPorto = enderecoPorto;
        FonePorto = fonePorto;
        Horarios = horarios;
        NomeEmbarcacao = nomeEmbarcacao;
        NomeEmpresa = nomeEmpresa;
        NomePorto = nomePorto;
        TipoEmbarcacao = tipoEmbarcacao;
        this.imagem = imagem;
    }

    public String getDuracaoViagem() {
        return DuracaoViagem;
    }

    public void setDuracaoViagem(String duracaoViagem) {
        DuracaoViagem = duracaoViagem;
    }

    public String getEnderecoPorto() {
        return EnderecoPorto;
    }

    public void setEnderecoPorto(String enderecoPorto) {
        EnderecoPorto = enderecoPorto;
    }

    public String getFonePorto() {
        return FonePorto;
    }

    public void setFonePorto(String fonePorto) {
        FonePorto = fonePorto;
    }

    public String getHorarios() {
        return Horarios;
    }

    public void setHorarios(String horarios) {
        Horarios = horarios;
    }

    public String getNomeEmbarcacao() {
        return NomeEmbarcacao;
    }

    public void setNomeEmbarcacao(String nomeEmbarcacao) {
        NomeEmbarcacao = nomeEmbarcacao;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        NomeEmpresa = nomeEmpresa;
    }

    public String getNomePorto() {
        return NomePorto;
    }

    public void setNomePorto(String nomePorto) {
        NomePorto = nomePorto;
    }

    public String getTipoEmbarcacao() {
        return TipoEmbarcacao;
    }

    public void setTipoEmbarcacao(String tipoEmbarcacao) {
        TipoEmbarcacao = tipoEmbarcacao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
