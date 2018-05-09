package br.com.ProjetoGames.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JogosModel {
    private int idJogos;
    private String titulo;
    private String genero;
    private String estado;//Novo, usado, risco na capa...
    private String situacao;//Alugado ou não
    private String descricao;
    private QuantidadeModel quantidadeDisponivel;
    private String plataforma;
    private Calendar dataLancamento;
    private String publisher;
    private String faixaEtaria;
    private byte[] imagem;
    //imagem? - byte[] image001; BufferedImage image002; File image003;

    public JogosModel() {
        idJogos = 0;
        titulo = new String();
        genero = new String();
        estado = new String();
        situacao = new String();
        descricao = new String();
        quantidadeDisponivel = new QuantidadeModel();
        plataforma = new String();
        dataLancamento = new GregorianCalendar();
        publisher = new String();
        faixaEtaria = new String();
        imagem = new byte[1024];
    }

    public JogosModel(int idJogos, String titulo, String genero, String estado, String situacao, String descricao, QuantidadeModel quantidadeDisponivel, String plataforma, Calendar dataLancamento, String publisher, String faixaEtaria, byte[] imagem) {
        this.idJogos = idJogos;
        this.titulo = titulo;
        this.genero = genero;
        this.estado = estado;
        this.situacao = situacao;
        this.descricao = descricao;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.plataforma = plataforma;
        this.dataLancamento = dataLancamento;
        this.publisher = publisher;
        this.faixaEtaria = faixaEtaria;
        this.imagem = imagem;
    }

    public int getIdJogos() {
        return idJogos;
    }

    public void setIdJogos(int idJogos) {
        this.idJogos = idJogos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public QuantidadeModel getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(QuantidadeModel quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Calendar getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Calendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
}
