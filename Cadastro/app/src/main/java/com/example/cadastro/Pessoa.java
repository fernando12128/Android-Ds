package com.example.cadastro;

public class Pessoa {

    //(id, nome, telefone, cpf, rg, endereço, numero, bairro, complemento, estado, cidade)
    private Double id;
    private String nome;
    private Double telefone;
    private Double cpf;
    private Double rg;
    private String endereço;
    private Double numero;
    private String bairro;
    private String complemento;
    private String estado;
    private String cidade;


    public Double getid(){
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Pessoa(){
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double gettelefone(){
        return telefone;
    }

    public void setTelefone(Double telefone) {
        this.telefone = telefone;
    }

    public Double getCpf(){
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public Double getrg(){
        return rg;
    }

    public void setrg(Double rg) {
        this.rg = rg;
    }

    public String getEndereço(){
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Double getnumero(){
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public String bairro(){
        return bairro;
    }
    public void setbairro(String bairro) {
        this.bairro = bairro;
    }

    public String complemento(){
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String estado(){
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String cidade(){
        return cidade;
    }
    public void setcidade(String cidade) {
        this.cidade = cidade;
    }

}
