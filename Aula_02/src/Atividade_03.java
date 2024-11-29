import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira Dois Numeros");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("A Soma dos numeros: "+(num1+num2));
        System.out.println("A Subtração dos numeros: "+(num1-num2));
        System.out.println("A multiplicação dos numeros: "+(num1*num2));
        System.out.println("A Divisão dos numeros: "+(num1/num2));

    }
}
