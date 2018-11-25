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
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class Teste {
    public static void main(String[] args) {
        try {
            UsuarioModel obj = new UsuarioModel();
            obj.setId(15);
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            JogosModel objJogo = new JogosModel();
            LocacaoModel objLoc;
            JogosLocadosData DAO = new JogosLocadosData();
            ArrayList<JogosModel> dados = DAO.pesquisar(obj);
            ArrayList<LocacaoModel> dadosLoc = DAO.dadosLocacao(obj);
            for (LocacaoModel c : dadosLoc) {
                objLoc = c;
                for (JogosOperacaoModel d : objLoc.getJogosOperacaoModel()) {
                    String titulo = d.getJogosModel().getTitulo();
                    String plataforma = d.getJogosModel().getPlataforma();
                    String publisher = d.getJogosModel().getPublisher();
                    String dataDev = dateFormat.format(objLoc.getDataDevolucao().getTime());
                    JOptionPane.showMessageDialog(null, titulo +" - "+plataforma+" - "+publisher+" - "+dataDev);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
