import java.util.Scanner;
public class Atividade_11 {
    public static void main(String[] args) {
        String palav;
        boolean palin=true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma palavra\n");
        palav=scan.next();
        for(int i =0; i<=palav.length()/2;i++){
            if(palav.charAt(i)!=palav.charAt(palav.length()-1-i)){
                palin=false;
            }
        }
        if(palin){
            System.out.println(palav+" Eh um PALINDROMO");
        }else{
            System.out.println(palav+" Nao eh um PALINDROMO");
        }
    }
}
