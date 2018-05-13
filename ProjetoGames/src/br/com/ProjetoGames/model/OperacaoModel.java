package br.com.ProjetoGames.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OperacaoModel {
    private int id;
    private UsuarioModel clienteModel;
    private FuncionarioModel funcionarioModel;
    private JogosModel jogosModel;
    private Calendar dataOperacao;
    private float valor;
    private String formaPagamento;
    private ArrayList<JogosOperacaoModel> jogosOperacaoModel;

    public OperacaoModel() {
        id = 0;
        clienteModel = new UsuarioModel();
        funcionarioModel = new FuncionarioModel();
        jogosModel = new JogosModel();
        dataOperacao = new GregorianCalendar();
        valor = 0;
        formaPagamento = new String();
        jogosOperacaoModel = new ArrayList<>();
    }

    public OperacaoModel(int id, UsuarioModel clienteModel, FuncionarioModel funcionarioModel, JogosModel jogosModel, Calendar dataOperacao, float valor, String formaPagamento, ArrayList<JogosOperacaoModel> jogosOperacaoModel) {
        this.id = id;
        this.clienteModel = clienteModel;
        this.funcionarioModel = funcionarioModel;
        this.jogosModel = jogosModel;
        this.dataOperacao = dataOperacao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.jogosOperacaoModel = jogosOperacaoModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsuarioModel getClienteModel() {
        return clienteModel;
    }

    public void setClienteModel(UsuarioModel clienteModel) {
        this.clienteModel = clienteModel;
    }

    public FuncionarioModel getFuncionarioModel() {
        return funcionarioModel;
    }

    public void setFuncionarioModel(FuncionarioModel funcionarioModel) {
        this.funcionarioModel = funcionarioModel;
    }

    public JogosModel getJogosModel() {
        return jogosModel;
    }

    public void setJogosModel(JogosModel jogosModel) {
        this.jogosModel = jogosModel;
    }

    public Calendar getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Calendar dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<JogosOperacaoModel> getJogosOperacaoModel() {
        return jogosOperacaoModel;
    }

    public void setJogosOperacaoModel(ArrayList<JogosOperacaoModel> jogosOperacaoModel) {
        this.jogosOperacaoModel = jogosOperacaoModel;
    }

    
}
