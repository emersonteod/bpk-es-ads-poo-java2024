package Exercicio02;

public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private boolean estadoCelular=false;

    public Celular() {
    }

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    void ligar(){
        System.out.println("O celular "+modelo+" está ligado");
    }

    void printarbateria(){
        System.out.println("Capacidade da bateria: "+capacidadeBateria+"%");
    }

    void desligar(){
        System.out.println("O celular está desligado");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public boolean isEstadoCelular() {
        return estadoCelular;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public void setEstadoCelular(boolean estadoCelular) {
        this.estadoCelular = estadoCelular;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria=" + capacidadeBateria +
                '}';
    }
}
