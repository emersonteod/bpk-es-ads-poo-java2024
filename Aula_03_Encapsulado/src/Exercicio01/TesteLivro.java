package Exercicio01;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("BLAHBLAHBLAH","Um Cabra ai",600);
        System.out.println(livro);

        Livro livro2=new Livro("BLERHBLERGBLERG","Um Cara AI",350);
        System.out.println(livro2);

        livro.abrir();
        livro.lerPagina();
    }
}