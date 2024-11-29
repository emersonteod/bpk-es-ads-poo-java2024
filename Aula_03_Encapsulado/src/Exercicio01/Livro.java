package Exercicio01;

public class Livro {
    private String Nome;
    private String Autor;
    private int NumerodePagina;
    private Integer paginaPercorrida;
    private boolean livroAberto;


    public Livro(String nome, String autor, int numerodePagina) {
        Nome = nome;
        Autor = autor;
        NumerodePagina = numerodePagina;
    }

    public String getNome() {
        return Nome;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumerodePagina() {
        return NumerodePagina;
    }

    public Integer getPaginaPercorrida() {
        return paginaPercorrida;
    }

    public boolean isLivroAberto() {
        return livroAberto;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setNumerodePagina(int numerodePagina) {
        NumerodePagina = numerodePagina;
    }

    public void setPaginaPercorrida(Integer paginaPercorrida) {
        this.paginaPercorrida = paginaPercorrida;
    }

    public void setLivroAberto(boolean livroAberto) {
        this.livroAberto = livroAberto;
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
