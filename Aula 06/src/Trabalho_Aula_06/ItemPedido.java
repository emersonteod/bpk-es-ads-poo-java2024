package Trabalho_Aula_06;

public class ItemPedido {
    private Produto produto;
    private Integer qnt;
    private double valor;

    public ItemPedido(Produto produto, Integer qnt) {
        this.produto = produto;
        this.qnt = qnt;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQnt() {
        return qnt;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double calcularSubtotal(){
        valor= produto.getPreco()*qnt;
        return valor;
    }

    @Override
    public String toString() {
        calcularSubtotal();
        return  produto +
                "Quantidade: " + qnt +", "+
                "SubTotal: R$ " + valor+"\n";
    }
}
