package Trabalho_Aula_06;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido1=new Pedido (1,new Cliente(new Endereco(
                true,
                "12345-12",
                "12",
                "Rua.Teste",
                "Toledo"),
                "Rafael"),
                new ItemPedido(new Produto(
                        "Bolo",
                        12.99),
                        3),
                new Endereco(true,
                "12345-12",
                "12",
                "Rua.Teste",
                "Toledo"));
        pedido1.addItemPedido(new ItemPedido(new Produto("Arroz",20.00),2));
        System.out.println(pedido1);
    }
}
