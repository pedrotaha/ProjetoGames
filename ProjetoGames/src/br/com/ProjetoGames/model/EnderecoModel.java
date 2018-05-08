package br.com.ProjetoGames.model;

public class EnderecoModel {
    private String pais;
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String cep;
    private String complemento;

    public EnderecoModel() {
        pais = new String();
        uf = new String();
        cidade = new String();
        bairro = new String();
        rua = new String();
        numero = 0;
        cep = new String();
        complemento = new String();
    }

    public EnderecoModel( String pais, String uf, String cidade, String bairro, String rua, int numero, String cep, String complemento) {
        this.pais = pais;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
}
