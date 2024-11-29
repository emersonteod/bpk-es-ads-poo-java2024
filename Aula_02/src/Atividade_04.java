import java.util.Scanner;

public class Atividade_04 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insira um Numero");
        int num1=scanner.nextInt();
        if(num1%2==0){
            System.out.println("O numero é PAR");
        }else{
            System.out.println("O numero é IMPAR");
        }
    }
}
