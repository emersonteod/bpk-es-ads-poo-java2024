package Teste_01;

public class TesteContaBancaria {
    public static void main(String[]args){
        ContaBancaria contab=new ContaBancaria(1,"Rafael",12000,1000);
        System.out.println(contab.getLimiteSaque());
        contab.setLimiteSaque(20);
        System.out.println(contab.getLimiteSaque());
    }
}
