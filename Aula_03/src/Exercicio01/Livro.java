package Exercicio01;

public class Livro {
    public String Nome;
    public String Autor;
    public int NumerodePagina;
    private Integer paginaPercorrida;
    private boolean livroAberto;

    public Livro() {
    }

    public Livro(String nome, String autor, int numerodePagina) {
        Nome = nome;
        Autor = autor;
        NumerodePagina = numerodePagina;
    }
    void abrir(){
        System.out.println("Livro " + Nome + " abrido");
    }

    void lerPagina(){
        System.out.println("Lendo uma pagina do Livro "+Nome);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome='" + Nome + '\'' +
                ", Autor='" + Autor + '\'' +
                ", NumerodePagina=" + NumerodePagina +
                '}';
    }
}
