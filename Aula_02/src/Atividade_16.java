import java.util.Scanner;
public class Atividade_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a conversao que deseja realizar:\n1-Celsius para Fahrenheit\n2-Fahrenheit para Celsius");
        System.out.println("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();
        double temperatura;
        double temperaturaConvertida;
        switch (opcao){
            case 1:
                System.out.println("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble();
                temperaturaConvertida =(temperatura*1.8)+32;
                System.out.println("Resultou em: "+temperaturaConvertida);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scanner.nextDouble();
                temperaturaConvertida =(temperatura-32)/1.8;
                System.out.println("Resultou em: "+temperaturaConvertida);
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }
}
