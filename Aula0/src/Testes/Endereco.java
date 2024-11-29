package Testes;

public class Endereco {
    private Integer nCasa;
    private String rua;
    private String bairro;

    public Endereco(Integer nCasa,String rua, String bairro){
        this.nCasa=nCasa;
        this.rua=rua;
        this.bairro=bairro;
    }
    public void setnCasa(Integer nCasa){
        this.nCasa=nCasa;
    }
    public void setRua(String rua){
        this.rua=rua;
    }
    public void setBairro(String bairro){
        this.bairro=bairro;
    }
    public Integer getnCasa(){
        return nCasa;
    }
    public String getrua(){
        return rua;
    }
    public String getBairro(){
        return bairro;
    }

    @Override
    public String toString() {
        return "Numero da Casa: " + nCasa +"\n"+
                "Rua: " + rua + "\n" +
                "Bairro: " + bairro + "\n";
    }
}
