package br.com.ProjetoGames.model.localizar;

public class LocalModel {
    private int idPais;
    private int idEstado;
    private int idCidade;
    private String nomePais;
    private String nomeEstado;
    private String nomeCidade;
    private String siglaPais;
    private String siglaEstado;
    private String siglaCidade;

    public LocalModel() {
    }

    public LocalModel(int idPais, int idEstado, int idCidade, String nomePais, String nomeEstado, String nomeCidade, String siglaPais, String siglaEstado, String siglaCidade) {
        this.idPais = idPais;
        this.idEstado = idEstado;
        this.idCidade = idCidade;
        this.nomePais = nomePais;
        this.nomeEstado = nomeEstado;
        this.nomeCidade = nomeCidade;
        this.siglaPais = siglaPais;
        this.siglaEstado = siglaEstado;
        this.siglaCidade = siglaCidade;
    }

    public String getSiglaCidade() {
        return siglaCidade;
    }

    public void setSiglaCidade(String siglaCidade) {
        this.siglaCidade = siglaCidade;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getSiglaPais() {
        return siglaPais;
    }

    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }
    
}
