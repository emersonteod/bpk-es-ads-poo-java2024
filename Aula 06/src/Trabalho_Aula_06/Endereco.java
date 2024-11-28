package Trabalho_Aula_06;

public class Endereco {
    private String rua;
    private String cidade;
    private String numero;
    private String cep;
    private boolean enderecoAtual;

    public Endereco(boolean enderecoAtual, String cep, String numero, String rua, String cidade) {
        this.enderecoAtual = enderecoAtual;
        this.cep = cep;
        this.numero = numero;
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public boolean isEnderecoAtual() {
        return enderecoAtual;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEnderecoAtual(boolean enderecoAtual) {
        this.enderecoAtual = enderecoAtual;
    }

    @Override
    public String toString() {
        return "Rua: " + rua +
                ", " + numero +
                ", " + cidade +
                ", " + cep;
    }
}
