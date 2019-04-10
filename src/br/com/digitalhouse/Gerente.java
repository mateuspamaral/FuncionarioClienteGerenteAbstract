package br.com.digitalhouse;

public class Gerente extends Funcionario {

    //Attributes
    private String area;

    //Constructor
    public Gerente(String nome, Data nascimento, Float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    //Methods
    @Override
    public void imprimeDados(){
        System.out.println("Funcionário: " + super.getNome() +
                "\nData de nascimento: " + super.getNascimento() +
                "\nSalário: " + super.salario +
                "\nÁrea: " + this.area);
    }

    @Override
    public Float calculaImposto() {
        return super.salario*1.05f;
    }
}
