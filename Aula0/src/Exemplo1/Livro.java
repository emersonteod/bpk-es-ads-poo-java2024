package Exemplo1;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String nome;
    private String isbn;
    private Autor autorlivros;

    public Livro(String nome, String isbn, Autor autorlivro) {
        this.nome = nome;
        this.isbn = isbn;
        this.addAutorLivro(autorlivro);
    }

    public String getNome() {
        return nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void addAutorLivro(Autor autorlivros){

    }
}
