package Banco;

public class TesteBanco {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rafael","1234566-12");
        pessoa.criarconta(new ContaCorrente(1,2000,Banco.NUBANK));
        pessoa.criarconta(new ContaPoupanca(1,2000,Banco.BANCO_DO_BRASIL));
        pessoa.criarconta(new ContaSalario(1,2000,Banco.CAIXA,"Pratti"));
        System.out.println(pessoa);
    }
}
