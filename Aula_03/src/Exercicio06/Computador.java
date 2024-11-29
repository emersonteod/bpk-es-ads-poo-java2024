package Exercicio06;

public class Computador {
    private String processador;
    private int RAM;
    private int armazenamento;

    public Computador(String processador,int RAM, int armazenamento) {

        this.processador = processador;
        this.RAM = RAM;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("o computador foi ligado");
    }

    public void desligar() {
        System.out.println("o computador foi desligado");
    }
}
