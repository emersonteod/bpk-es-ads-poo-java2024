package Trabalho_Aula_06;

public class Cliente {
    private String nome;
    private Endereco endereco;

    public Cliente(Endereco enderecos, String nome) {
        this.endereco = enderecos;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return nome +", Endereço: "+ endereco;

    }
}
