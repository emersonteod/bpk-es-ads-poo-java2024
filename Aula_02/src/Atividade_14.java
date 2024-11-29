import java.util.Scanner;
public class Atividade_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma  palavra: ");
        String input = scanner.nextLine();
        int contadorVogais = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais: " + contadorVogais);
    }
}
