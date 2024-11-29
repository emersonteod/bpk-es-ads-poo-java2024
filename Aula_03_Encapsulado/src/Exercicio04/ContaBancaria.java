package Exercicio04;

public class ContaBancaria {
    private Integer numeroConta;
    private double saldo;

    public ContaBancaria(Integer numeroConta, Integer saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado com sucesso! Novo saldo: " + saldo);
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }


    public Integer getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}