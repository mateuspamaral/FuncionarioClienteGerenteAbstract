package br.com.digitalhouse;

public abstract class Pessoa {

    //Attributes
    private String nome;
    private Data nascimento;

    //Constructor
    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    //Methods
    public abstract void imprimeDados();
}
