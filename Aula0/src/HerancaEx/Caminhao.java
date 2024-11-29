package HerancaEx;

public class Caminhao extends Veiculo{
    private TipoCarga tipoCarga;
    public Caminhao(String modelo, int ano, String marca,TipoCarga tipoCarga) {
        super(modelo, ano, marca);
        this.tipoCarga=tipoCarga;
    }

    public TipoCarga getTipoCarga() {
        return tipoCarga;
    }
    public void carregarCarga(){
        System.out.println("Carregando");
    }
    @Override
    public String toString() {
        return "Caminhao{" +
                "modelo='" + super.getModelo() + '\'' +
                ", ano=" + super.getAno() +
                ", marca='" + super.getMarca() + '\'' +
                ", Tipo de Carga: "+getTipoCarga();
    }
}
