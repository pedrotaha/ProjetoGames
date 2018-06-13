package br.com.ProjetoGames.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocacaoModel extends OperacaoModel{
    private Calendar dataDevolucao;

    public LocacaoModel() {
        super();
        dataDevolucao = new GregorianCalendar();
    }

    public LocacaoModel(int id, UsuarioModel clienteModel, FuncionarioModel funcionarioModel, JogosModel jogosModel, Calendar dataOperacao, float valor, String formaPagamento, ArrayList<JogosOperacaoModel> jogosOperacaoModel,int desconto,Calendar dataDevolucao) {
        super(id, clienteModel, funcionarioModel, jogosModel, dataOperacao, valor, formaPagamento, jogosOperacaoModel, desconto);
        this.dataDevolucao = dataDevolucao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
}
