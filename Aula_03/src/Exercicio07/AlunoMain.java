package Exercicio07;

import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rafael", 123, "ADS");

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas notas deseja inserir?");
        int contagem = scan.nextInt();
        double[] vet = new double[contagem];

        int i = 0;
        while (i < contagem) {
            System.out.printf("Insira a nota %d: ", i + 1);
            vet[i] = scan.nextDouble();
            i++;
        }
        System.out.println("A média das notas é: " + aluno.calcularMedia(vet));
    }
}
