package Exercicio11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        populacao += quantidade;
        System.out.println("A população da cidade"+nome+" aumentou. População atual: " + populacao);
    }

    public void diminuirPopulacao(int quantidade) {
        System.out.println("A população da cidade"+nome+" diminuiu. População atual: " + populacao);
    }
}
