package Exercicio02;

public class TesteCelular {
    public static void main(String[] args) {
        Celular celular= new Celular("Teste","A13",1000);
        Celular celular1=new Celular("Teste2","A15",2000);
        System.out.println(celular);
        System.out.println(celular1);
        celular.desligar();
        celular.ligar();
        celular.printarbateria();
    }
}
