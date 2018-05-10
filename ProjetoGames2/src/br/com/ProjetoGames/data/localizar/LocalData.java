package br.com.ProjetoGames.data.localizar;

import br.com.ProjetoGames.model.localizar.LocalModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LocalData {

    public ArrayList<LocalModel> pesquisarPais() throws Exception {
        ArrayList<LocalModel> dados = new ArrayList<>();
        String sql = "Select * from pais order by sl_nome";
        ConectLocal c = new ConectLocal();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalModel obj = new LocalModel();
            obj.setNome(rs.getString("sl_nome"));
            obj.setId(rs.getInt("sl_id"));
            obj.setSigla("sl_sigla");
            dados.add(obj);
        }
        return dados;
    }

    public ArrayList<LocalModel> pesquisarEstado() throws Exception {
        ArrayList<LocalModel> dados = new ArrayList<>();
        String sql = "Select * from estado order by uf_nome";
        ConectLocal c = new ConectLocal();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalModel obj = new LocalModel();
            obj.setNome(rs.getString("uf_nome"));
            obj.setId(rs.getInt("uf_id"));
            obj.setSigla("uf_sigla");
            dados.add(obj);
        }
        return dados;
    }
    
        public ArrayList<LocalModel> pesquisarCidade(int id) throws Exception {
        ArrayList<LocalModel> dados = new ArrayList<>();
        String sql = "Select * from cidade where ct_uf = "+id+"order by uf_nome";
        ConectLocal c = new ConectLocal();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalModel obj = new LocalModel();
            obj.setNome(rs.getString("uf_nome"));
            obj.setId(rs.getInt("uf_id"));
            obj.setSigla("uf_sigla");
            dados.add(obj);
        }
        return dados;
    }
}
