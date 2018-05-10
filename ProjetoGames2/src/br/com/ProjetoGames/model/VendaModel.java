package br.com.ProjetoGames.model;

import java.util.ArrayList;
import java.util.Calendar;

public class VendaModel extends OperacaoModel{
    private String tipo;

    public VendaModel() {
        super();
        tipo = new String();
    }

    public VendaModel(int id, UsuarioModel clienteModel, FuncionarioModel funcionarioModel, JogosModel jogosModel, Calendar dataOperacao, float valor, String formaPagamento, ArrayList<JogosOperacaoModel> jogosOperacaoModel, String tipo) {
        super(id, clienteModel, funcionarioModel, jogosModel, dataOperacao, valor, formaPagamento, jogosOperacaoModel);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
