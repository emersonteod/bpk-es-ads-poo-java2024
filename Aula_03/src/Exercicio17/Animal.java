package Exercicio17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar() {
        System.out.println("O " + especie +"de idade: "+idade+" de peso: "+peso+ " foi alimentado.");
    }

    public void dormir() {
        System.out.println("O " + especie +"de idade: "+idade+" de peso: "+peso+ " foi dormir");
    }
}
