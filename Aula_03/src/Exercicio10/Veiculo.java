package Exercicio10;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("O veículo " + tipo + " de placa " + placa +" e cor "+cor+ " foi abastecido.");
    }

    public void dirigir() {
        System.out.println("Você esta diriginido o carro " + tipo + " de placa " + placa + " e cor " +cor);
    }
}
