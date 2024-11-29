package Banco;

public class ContaSalario extends ContaBancaria implements IContaBancaria {
    private String empresa;

    public ContaSalario(int numero, double saldo,Banco banco, String empresa) {
        super(numero, saldo, banco);
        this.empresa = empresa;
    }

    @Override
    public void sacar(double valor) {
        if(valor<saldo){
            saldo-=valor;
            System.out.println("Saldo realizado com sucesso\nSaldo atual: "+saldo);
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "empresa='" + empresa + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", banco=" + banco +
                '}';
    }
}

