package Exercicio19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private int tamanhoArquivo; // Em MB

    public LivroDigital(String titulo, String autor, int tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrir() {
        System.out.println("O livro digital " + titulo +" do autor: "+autor+" de tamanho: "+tamanhoArquivo+ " foi aberto.");
    }

    public void fechar() {
        System.out.println("O livro digital " + titulo +" do autor: "+autor+" de tamanho: "+tamanhoArquivo+ " foi fechado.");
    }
}
