package Exercicio11;

public class CidadeMain {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "RJ");
        System.out.println("População atual: "+cidade.getPopulacao());
        cidade.aumentarPopulacao(1000);
        cidade.diminuirPopulacao(12000999);
    }
}

