package Exercicio04;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta=new ContaBancaria(12321421,1900);
        System.out.println(conta);
        conta.depositar(2000.0);
        System.out.println("Saldo da conta: " + conta.getSaldo());
        conta.sacar(100);
        System.out.println("Saldo da conta: " + conta.getSaldo());

    }
}
