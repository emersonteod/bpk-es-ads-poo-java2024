
package Exercicio14;
public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogador() {
        numeroDeJogadores++;
        System.out.println("Jogador adicionado ao "+nome+". Número de jogadores: " + numeroDeJogadores);
    }

    public void removerJogador() {
        numeroDeJogadores--;
        System.out.println("Jogador removido do time. Número de jogadores: " + numeroDeJogadores);
    }
}
