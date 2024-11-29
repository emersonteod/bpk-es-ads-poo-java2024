import java.util.Scanner;

public class Atividade_09 {
    public static void main(String[]args){
        int respcalc,num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira um Valor\n1-Soma\n2-Substração\n3-Divisão\n4-Multplicação");
        respcalc=scanner.nextInt();
        switch (respcalc){
            case 1:
                System.out.println("Insira 2 Valores");
                num1=scanner.nextInt();
                num2=scanner.nextInt();
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println("Insira 2 Valores");
                num1=scanner.nextInt();
                num2=scanner.nextInt();
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println("Insira 2 Valores");
                num1=scanner.nextInt();
                num2=scanner.nextInt();
                System.out.println(num1/num2);
                break;
            case 4:
                System.out.println("Insira 2 Valores");
                num1=scanner.nextInt();
                num2=scanner.nextInt();
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Algo deu ERRADO!!!!");
                break;
        }
    }
}
