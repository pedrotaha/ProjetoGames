package br.com.ProjetoGames.model;

public class JogosOperacaoModel {
    private JogosModel jogosModel;
    private int quantidade;

    public JogosOperacaoModel() {
        jogosModel = new JogosModel();
        quantidade = 0;
    }

    public JogosOperacaoModel(JogosModel jogosModel, int quantidade) {
        this.jogosModel = jogosModel;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public JogosModel getJogosModel() {
        return jogosModel;
    }

    public void setJogosModel(JogosModel jogosModel) {
        this.jogosModel = jogosModel;
    }
    
}
