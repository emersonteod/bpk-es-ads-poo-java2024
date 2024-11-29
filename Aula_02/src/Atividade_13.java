import java.util.Scanner;
import java.util.Random;
public class Atividade_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randola = new Random();
        int aleat = randola.nextInt(101);
        int num;
        int tent=0;
        boolean acert=false;
        System.out.println("Tente advinhar o numero\n0-100");
        do{
            num=scan.nextInt();
                System.out.println("Numero errado");
                if(num<aleat){
                    System.out.println("Tente maior");
                }else{
                    System.out.println("Tente menor");
                }
        }while(num!=aleat);
        System.out.println("Voce acertou o numero era: "+aleat);
    }
}
