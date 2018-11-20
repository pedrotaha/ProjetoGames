package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private Connection con;

    public Conexao() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/bdProjetoGames";
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, "postgres", "88151926");//postdba
    }

    public Connection getConexao() {
        return con;
    }
}