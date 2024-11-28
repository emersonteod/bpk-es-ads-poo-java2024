import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("teste1",100.0));
        produtos.add(new Produto("teste2",150.0));
        produtos.add(new Produto("teste3",200.0));
        produtos.add(new Produto("teste4",250.0));
        produtos.add(new Produto("teste5",300.0));
    }
}