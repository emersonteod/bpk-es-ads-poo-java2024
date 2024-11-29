import java.util.Arrays;
import java.util.Scanner;
public class Atividade_12 {
    public static void main(String[] args) {
        int[] lista=new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 5 numeros\n");
        for(int i=0;i<lista.length;i++){
            lista[i]=scan.nextInt();
        }
        Arrays.sort(lista);
        System.out.println("Lista organizada\nImprimindo...\n");
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]+" ");
        }
    }
}
