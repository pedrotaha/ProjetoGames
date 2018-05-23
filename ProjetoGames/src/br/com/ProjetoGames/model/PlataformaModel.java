package br.com.ProjetoGames.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PlataformaModel {
    private int id;
    private String nome;
    private Calendar dataLancamento;

    public PlataformaModel() {
        id = 0;
        nome = new String();
        dataLancamento = new GregorianCalendar();
    }

    public PlataformaModel(int id, String nome, Calendar dataLancamento) {
        this.id = id;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
    }

    public Calendar getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Calendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
