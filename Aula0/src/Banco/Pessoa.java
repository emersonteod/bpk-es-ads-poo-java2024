package Banco;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private List<IContaBancaria> contas;
    private double valTot;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas=new ArrayList<>();
    }

    public void criarconta(IContaBancaria IContaBancaria){
        contas.add(IContaBancaria);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for(IContaBancaria conta:contas){
            sb.append(conta).append("\n");
        }
        return  "Nome: "+ nome+"\n"+"CPF: "+cpf+"\n"+
                sb.toString()+
                "Valor Total: ";
    }

}
