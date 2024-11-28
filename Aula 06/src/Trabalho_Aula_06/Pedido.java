package Trabalho_Aula_06;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private Endereco enderecoEntrega;
    private List<ItemPedido> items;
    private double total;

    public Pedido(int numero, Cliente cliente, ItemPedido item, Endereco endereco) {
        this.numero = numero;
        this.cliente = cliente;
        this.enderecoEntrega = endereco;
        this.items = new ArrayList<>();
        this.addItemPedido(item);
        this.total = 0.0; // Inicializa o total como 0
    }

    public int getNumero() {
        return numero;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void addItemPedido(ItemPedido item) {
        this.items.add(item);
        calcularTotal(); // Recalcula o total sempre que um item é adicionado
    }

    public void removeItemPedido(ItemPedido item) {
        this.items.remove(item);
        calcularTotal(); // Recalcula o total sempre que um item é removido
    }

    public void calcularTotal() {
        total = 0.0; // Reinicia o total
        for (ItemPedido item : items) {
            total += item.calcularSubtotal(); // Acessa o método para calcular o subtotal do item
        }
    }

    @Override
    public String toString() {
        return "Numero do Pedido: " + numero + "\n" +
                "Cliente: " + cliente +
                "\nEndereço de Entrega: " + enderecoEntrega +
                "\nItens do Pedido: \n" + items +
                "Total: R$ " + total;
    }
}
