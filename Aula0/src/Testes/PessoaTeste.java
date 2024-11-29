package Testes;

public class PessoaTeste {
    public static void main(String[]args){
        Pessoa teste= new Pessoa("Rafael",17,new Endereco(1212,"Rua Teste","Bairro Teste"));
        System.out.println(teste);
        Endereco teste1 = new Endereco(12344,"Sla","asda");
        System.out.println(teste1);
    }
}
