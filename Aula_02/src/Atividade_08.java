import java.util.Scanner;

public class Atividade_08 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira seu NOME e IDADE");
        String nome=scanner.nextLine();
        int idade=scanner.nextInt();
        System.out.println("Carregando...");
        System.out.println(nome);
        System.out.println(idade);
    }
}
