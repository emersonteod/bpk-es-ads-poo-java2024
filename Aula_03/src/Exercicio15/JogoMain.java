package Exercicio15;

public class JogoMain {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Risk of Rain 2", "Ação", 23.42);
        jogo.iniciar();
        jogo.pausar();
    }
}
