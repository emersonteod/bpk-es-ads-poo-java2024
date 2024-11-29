package HerancaEx;

public class Veiculo {
    private String modelo;
    private int ano;
    private String marca;

    public Veiculo(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }
    public void acelerar(){
        System.out.println("\nAcelerando");
    }
    public void frear(){
        System.out.println("\nFreando");
    }


}
