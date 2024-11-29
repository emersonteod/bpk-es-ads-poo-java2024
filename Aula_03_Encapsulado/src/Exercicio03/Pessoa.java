package Exercicio03;

public class Pessoa {
    private String nome;
    private Integer idade;
    private double altura;

    public Pessoa(String nome, Integer idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
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
