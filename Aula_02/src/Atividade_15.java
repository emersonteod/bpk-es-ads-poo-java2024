import java.util.Scanner;
public class Atividade_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro para calcular o fatorial: ");
        int numero=scanner.nextInt();
        System.out.println("Fatorial iterativa de "+numero+" é: "+fatorialIterativo(numero));
        System.out.println("Fatorial recursiva de "+numero+" é: "+fatorialRecursivo(numero));
    }

    public static int fatorialIterativo(int num) {
        int fatorial=1;
        for (int i=1;i<=num;i++) {
            fatorial*=i;
        }
        return fatorial;
    }

    public static int fatorialRecursivo(int num) {
        if (num == 0||num == 1) {
            return 1;
        } else {
            return num * fatorialRecursivo(num - 1);
        }
    }
}
