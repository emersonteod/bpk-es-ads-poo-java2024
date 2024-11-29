package HerancaEx;

public class Carro extends Veiculo{
    private int numPorta;

    public Carro(String modelo, int ano, String marca,int numPorta) {
        super(modelo, ano, marca);
        this.numPorta=numPorta;
    }

    public int getNumPorta() {
        return numPorta;
    }
    public void abrirPorta(){
        System.out.println("Abrindo porta");
    }
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + super.getModelo() + '\'' +
                ", ano=" + super.getAno() +
                ", marca='" + super.getMarca() + '\'' +
                ", Numero de Porta: "+getNumPorta();
    }
}
