package Exercicio03;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa=new Pessoa("Julio",18,1.70);
        System.out.println("Ola Me Chamo: "+pessoa.nome+"\nTenho "+pessoa.idade+" anos\n"+"E tenho: "+pessoa.altura+" de Altura");
    }
}
