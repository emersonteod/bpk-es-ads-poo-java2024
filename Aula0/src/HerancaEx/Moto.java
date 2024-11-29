package HerancaEx;

public class Moto extends Veiculo{
    private TipoPartida tipoPartida;
    public Moto(String modelo, int ano, String marca,TipoPartida tipoPartida) {
        super(modelo, ano, marca);
        this.tipoPartida=tipoPartida;
    }

    public TipoPartida getTipoPartida() {
        return tipoPartida;
    }

    public void empinar(){
        System.out.println("Empinando");
    }
    @Override
    public String toString() {
        return "Moto{" +
                "modelo='" + super.getModelo() + '\'' +
                ", ano=" + super.getAno() +
                ", marca='" + super.getMarca() + '\'' +
                ", Tipo de Partida: "+getTipoPartida();
    }
}
