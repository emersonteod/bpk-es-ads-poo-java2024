package Testes;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade,Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos=new ArrayList<>();
        this.addEndereco(endereco);
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(Integer idade){
        this.idade=idade;
    }
    public Integer getIdade(){
        return idade;
    }
    public void addEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Idade: "+ idade +"\n"+
                "Endereco: " + enderecos;
    }
}
