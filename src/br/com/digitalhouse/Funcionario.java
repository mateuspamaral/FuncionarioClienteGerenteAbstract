package br.com.digitalhouse;

public class Funcionario extends Pessoa {

    //Attributes
    protected Float salario;

    //Constructor
    public Funcionario(String nome, Data nascimento, Float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    //Methods
    @Override
    public void imprimeDados() {
        System.out.println("Funcionário: " + super.getNome() +
                            "\nData de nascimento: " + super.getNascimento() +
                            "\nSalário: " + this.salario);
    }

    public Float calculaImposto(){
        return this.salario*0.03f;
    }

}
