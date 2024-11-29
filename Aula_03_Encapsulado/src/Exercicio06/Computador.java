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

    public String getProcessador() {
        return processador;
    }

    public int getRAM() {
        return RAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
