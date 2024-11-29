package Exercicio09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void aumentarEstoque(int quantidades) {
        quantidade += quantidades;
        System.out.println("Estoque aumentado. Quantidade atual: " + quantidade);
    }

    public void diminuirEstoque(int quantidades) {
        if (quantidade <= quantidades) {
            quantidade -= quantidades;
            System.out.println("Estoque diminuído. Quantidade atual: " + quantidade);
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}

