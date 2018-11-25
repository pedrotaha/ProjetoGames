/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view;

import br.com.ProjetoGames.data.JogosLocadosData;
import br.com.ProjetoGames.model.JogosModel;
import br.com.ProjetoGames.model.JogosOperacaoModel;
import br.com.ProjetoGames.model.LocacaoModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class Teste {

    public void doSome() {
        UsuarioModel obj = new UsuarioModel();
        obj.setId(15);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        JogosModel objJogo = new JogosModel();
        LocacaoModel objLoc = new LocacaoModel();
        ArrayList<LocacaoModel> dadosLoc = new ArrayList<>();
        JogosLocadosData DAO = new JogosLocadosData();
        ArrayList<JogosModel> dados = DAO.pesquisar(obj);
        dadosLoc = DAO.dadosLocacao(obj);
        for (LocacaoModel c : dadosLoc) {
            objLoc = c;
            for (JogosOperacaoModel d : objLoc.getJogosOperacaoModel()) {

                 = d.getJogosModel().getTitulo();
                 = d.getJogosModel().getPlataforma();
                 = d.getJogosModel().getPublisher();
                 = dateFormat.format(objLoc.getDataDevolucao().getTime());

            }
        }
    }
}
