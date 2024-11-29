import java.util.Scanner;
public class Atividade_10 {
    public static void main(String[]args){
        boolean primo=true;
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insira um numero");
        num=scanner.nextInt();
        if(num<=1){
            primo=false;
        }else{
            for(int i = 2;i<=num/2;i++){
                if(num%i==0){
                    primo=false;
                }
            }
        }
        if(primo){
            System.out.println("Eh PRIMO");
        }else{
            System.out.println("Nao eh PRIMO");
        }
    }
}
