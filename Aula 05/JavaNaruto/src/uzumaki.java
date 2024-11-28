public class uzumaki extends ninja {

    boolean temBiju;



    public void chacrahInfinito() {
        System.out.println("Você é um Uzumaki entao voce tem chacrah infinito");
    }
    @Override
    public void ataqueBase() {
        System.out.println("eu sou um ninja-Uzumaki e taquei uma kunai do elemento vento");
    }

    public void ataqueBase(int nivelDeChacra) {
        if (nivelDeChacra > 2) {
            System.out.println("Suzano ativado");
        }
        else if (nivelDeChacra > 1) {
            System.out.println("eu jogo uso o sharinkan");
        }


    }


}
