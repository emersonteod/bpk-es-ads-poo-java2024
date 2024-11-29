import java.util.Scanner;

public class EntradaSaidaDados {
    public String processarEntrada(String msgDisplay){
        Scanner scanner = new Scanner(System.in);
        System.out.printf(msgDisplay);
        return scanner.nextLine();
    }
}
