package Banco;

public class ContaPoupanca extends ContaBancaria implements IContaBancaria {

    public ContaPoupanca(int numero, double saldo,Banco banco) {
        super(numero, saldo, banco);
    }

    @Override
    public void sacar(double valor) {
        if(valor<saldo){
            saldo-=valor;
            System.out.println("Saldo realizado na Conta Bancaria com sucesso\nSaldo atual: "+saldo);
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", banco=" + banco +
                '}';
    }
}
