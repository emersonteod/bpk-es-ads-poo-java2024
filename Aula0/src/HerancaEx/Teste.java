package HerancaEx;

public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro("Corsa",2007,"Chevrolet",4);
        System.out.println(carro);
        carro.abrirPorta();
        Moto moto = new Moto("CG",2015,"Honda",TipoPartida.ELETRICA);
        System.out.println(moto);
        moto.empinar();
        Caminhao caminhao = new Caminhao("Bitrem",2010,"Mercedes",TipoCarga.SOLIDO);
        System.out.println(caminhao);
        caminhao.carregarCarga();
    }
}
