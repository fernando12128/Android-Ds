package com.example.firebase;

public class Pessoa {

    //(id, nome, telefone, cpf, rg, endereço, numero, bairro, complemento, estado, cidade)
    private int id;
    private String nome;
    private Double telefone;
    private int cpf;
    private int rg;
    private String endereço;
    private int numero;
    private String bairro;
    private String complemento;
    private String estado;
    private String cidade;


    public int getId(){
        return id;
    }

    public void setId(int id) {
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

    public Double getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = Double.valueOf(telefone);
    }

    public int getCpf(){
        return cpf;
    }

    public void setCpf(int cpf) {this.cpf = cpf;}

    public int getRg(){
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getEndereço(){
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero) {this.numero = numero;}

    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro) { this.bairro = bairro;}

    public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
