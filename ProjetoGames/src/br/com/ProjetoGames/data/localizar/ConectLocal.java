/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.data.localizar;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pedro
 */
public class ConectLocal {
    
    private Connection con;

    public ConectLocal() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/bdLocalizacao";
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, "postgres", "88151926");//postdba
    }

    public Connection getConexao() {
        return con;
    }
}
