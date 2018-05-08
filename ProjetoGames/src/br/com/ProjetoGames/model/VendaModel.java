package br.com.ProjetoGames.model;

import java.util.Calendar;

public class VendaModel extends Operacao{
    private String tipo;

    public VendaModel() {
        super();
        tipo = new String();
    }

    public VendaModel(String tipo, int id, UsuarioModel clienteModel, FuncionarioModel funcionarioModel, JogosModel jogosModel, Calendar dataOperacao, float valor, String formaPagamento) {
        super(id, clienteModel, funcionarioModel, jogosModel, dataOperacao, valor, formaPagamento);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
