package Exercicio03;

public class Pessoa {
    public String nome;
    public Integer idade;
    public double altura;
    private String apresentacao;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void Apresentacaoteste(){
        System.out.println("Ola Me Chamo: "+nome+"\nTenho "+idade+" anos\n"+"E tenho: "+altura+" de Altura");

    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", altura='" + altura + '\'' +
                '}';
    }
}
