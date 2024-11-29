package Exercicio09;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto = new Produto("laranja", 20.0, 10);
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
    }
}
