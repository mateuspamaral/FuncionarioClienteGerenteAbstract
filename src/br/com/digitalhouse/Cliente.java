package br.com.digitalhouse;

public class Cliente extends Pessoa {

    //Attributes
    private int codigo;

    //Constructor
    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    //Methods
    @Override
    public void imprimeDados() {
        System.out.println("Cliente: " + super.getNome() +
                            "\nCódigo: " + this.codigo +
                            "\nData de nascimento: " + super.getNascimento());
    }
}
