package Teste_01;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaBancaria(int numeroConta, String titular, double saldo, double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo && valor <= limiteSaque) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double consultarSaldo() {
        return saldo;
    }
    public double transferir(transfer) {
        return saldo-transfer();
    }
}
