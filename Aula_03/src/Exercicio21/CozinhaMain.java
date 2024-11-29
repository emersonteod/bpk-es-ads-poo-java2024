package Exercicio21;

public class CozinhaMain {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Cozinha normal", 6, "Preto");
        cozinha.cozinhar();
        cozinha.limpar();
    }
}
