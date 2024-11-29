package Exercicio21;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha do tipo: "+tipo+" que suporta: "+quantidadePessoas+" pessoas e de cor: "+cor+" esta sendo usada para cozinhar");
    }

    public void limpar() {
        System.out.println("A cozinha do tipo: "+tipo+" que suporta: "+quantidadePessoas+" pessoas e de cor: "+cor+" esta sendo limpa");
    }
}

