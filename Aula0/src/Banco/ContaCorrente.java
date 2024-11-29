package Banco;

public class ContaCorrente extends ContaBancaria implements IContaBancaria {


    public ContaCorrente(int numero,double saldo,Banco banco) {
        super(numero,saldo,banco);
    }

    @Override
    public void sacar(double valor) {
        if(valor<saldo){
            saldo-=valor;
            System.out.println("Saldo realizado Conta Corrente com sucesso\nSaldo atual: "+saldo);
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", banco=" + banco +
                '}';
    }
}
