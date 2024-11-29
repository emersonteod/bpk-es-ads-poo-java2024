package Exercicio02;

public class Celular {
    public String marca;
    public String modelo;
    public int capacidadeBateria;
    private boolean estadoCelular=false;

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
    public void ligarCelular(boolean celular){
        this.estadoCelular=true;
    }
    public void desligarCelular(boolean celular){
        this.estadoCelular=false;
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
